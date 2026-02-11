public class Split_Array_MAX_Leetcode_410{
    public static void main(String [] args){
        int[] nums = {7,2,5,10,8};
        int k =2;
        System.out.println(splitArray(nums,k)); 
    }
    private static int splitArray(int[] nums ,int k){
        int low = 0;
        int high =0;
        for(int n : nums){
            high += n;

        }
        int ans = -1;
        low = high/ k;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(isValid(arr,mid,k)){
                ans = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;

            }
        }
        return ans;
    }

    private static boolean isValid(int[] arr, int mid , int k){
        int sum =0;
        int count = 1;
        for(int n : arr){
            sum+= n;
            if(sum > mid){
                sum = n;
                count++;
                if(count > k){
                    return false;
                }
            }
        }
    }
}
