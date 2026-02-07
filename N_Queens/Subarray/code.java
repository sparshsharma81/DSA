package Subarray;

public class code {
    private static boolean isPossible(int s, int[] arr, int t){
        int sum =0;
        for(int i=0;i<s;i++){
            sum+=arr[i];
        }
        if(sum >=t)return true;

        for(int i=s;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i];
            if(sum>=t)return true;
        }
        return false;
    }

}
