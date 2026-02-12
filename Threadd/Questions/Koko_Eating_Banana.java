public class Koko_Eating_Banana {
    class Solution {
    private static boolean isPossible(int[] arr, int a,int h){
        int sum =0;
        int s2=0;
        for(int i =0;i<arr.length;i++){
            // s2+=Math.ceil((double)arr[i]/(double)a);

            // System.out.println((float)arr[i]/(float)a);
            // System.out.println(Math.ceil((float)arr[i]/(float)a));
            // System.out.println();

            if(arr[i] % a ==0)sum+=arr[i]/a;
            else sum+= arr[i]/a + 1;
            // System.out.println(s2+" "+sum);
            if(sum >h)return false;
        }

        return true;

    }
    public int minEatingSpeed(int[] piles, int h) {
        //so we need to find out how many bananas can he eat..
        //obiously..it start from 1 and end at the largest value ;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)max = Math.max(max,piles[i]);

        int low = 1;
        int high = max;
        int answer = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(piles,mid,h) ){
                high = mid -1;
                answer = Math.min(answer,mid);
            }
            else{
                //now not possible 
                low = mid+1;

            }
        }

        return answer;


    }
}
    public static void main(String args[]){

    }
}
