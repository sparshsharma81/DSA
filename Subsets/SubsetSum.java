package Subsets;

public class SubsetSum {
    public static boolean ans(int[] arr,int sum, int i){
        if(sum ==0)return true;
        if(i == arr.length)return false;
        return ans(arr,sum,i+1) || ans(arr,sum-arr[i],i+1);
    }
    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in
        int[] arr = new int[]{1,2,3,4};
        System.out.println(ans(arr,6,0));
    }
}
