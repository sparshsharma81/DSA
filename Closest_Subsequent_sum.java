public class Closest_Subsequent_sum{
    private static int binary(int a, ArrayList<Integer>s){
        //we need to find the maximum number which is smaller than a 
        int l =0;
        int r= s.size()-1;
        int ans =-1;
        while(l<=r){
            int mid = l + (r - l)/2;
           
            if(s.get(mid) < a){
                ans = s.get(mid);
                // if( s.get(mid +1) >=a)return s.get(mid);
                l = mid+1;
            }
          else r = mid -1;
        }
        return ans;
    }
    private static void subset(int[] nums,int i , int sum ,ArrayList<Integer>h1){
        if(i == nums.length){
            h1.add(sum);
            return;
        }
        subset(nums,i+1,sum,h1); //this one is  the excluding case
        subset(nums,i+1, sum+nums[i],h1); //this one is the includding case 
        
    }
    public int minAbsDifference(int[] nums, int goal) {
        //now here we use the meet in the middle algorithm 
        // which is basically dividing the array into two parts
        //and then doing operation it
        int mid = nums.length/2;
        int n = nums.length;
       
        int[] first = Arrays.copyOfRange(nums,0,mid);
        int[] sec = Arrays.copyOfRange(nums,mid,n);
        
        ArrayList<Integer>f = new ArrayList<>();
        ArrayList<Integer>s = new ArrayList<>();

        subset(first,0,0,f);
        subset(sec,0,0,s);

        //now till now we have done all the work..
        //now we will sort

        Collections.sort(s);

        //now we will follow up the two pointer approach 
        //ne need to search for a number ---
        // which is less than sum - x

        // int i=0;
        int ans = Integer.MAX_VALUE;

        // we have f[i] + s[j] <= goal
        //but this binary will give us lower bound

        for(int i : f){
            //this is the man in the middle agorithm
            if(i == goal)return 0;
            int need = goal - i;
            int low = binary(need,s); //this functionn will return the number 
            //just lower than that

        if(low != -1){
            ans = Math.min(ans,Math.abs(i + low- goal));
        }

        //checking for upper bound 
        int idx = Collections.binarySearch(s,need);
        if(idx < 0)idx = -idx -1;

        if(idx < s.size()){
            int high = s.get(idx);
            ans = Math.min(ans,Math.abs(i + high - goal));
        }
        }
        return ans;

        
    }
}