package Dynamic Programming;

public class dp {
    public static void main(String args[]){
        int[] arr = {2,7,9,3,1};
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.println(fib(arr.length-1,arr,dp));

    }
    private static int solve(int[] arr, int[] dp){
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2;i<dp.length;i++){
            int rob = arr[i] + dp[i-2];
            int drop = dp[i-1];
            dp[i] = Math.max(rob,drop);

        }
        return dp[dp.length -1];
    }
}

///this is the classic problem of house robber 
/// this approach is known as bottom up approach (tabulation)