// package Dynamic Programming;

public class dp_memo {
    public static void main(String args[]){
        int[] arr = {2,7,9,3,1};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(fib(arr.length-1,arr,dp));
    }

    public static int fib(int n, int[] arr, int[] dp) {
        if (n < 0) return 0;
        if (n == 0) return arr[0];
        if (dp[n] != -1) return dp[n];
        dp[n] = Math.max(fib(n-1, arr, dp), fib(n-2, arr, dp) + arr[n]);
        return dp[n];
    }
}
