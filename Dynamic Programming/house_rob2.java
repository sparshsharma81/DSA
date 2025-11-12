// package Dynamic Programming;

public class house_rob2 {
    public int rob(int[] arr) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        int a = solve(arr,dp,0,arr.length-2);
        return a;
    }
    private static int solve(int[] arr, int[] dp, int st, int ed){
        
        dp[st] = arr[st];
        dp[st+1] = Math.max(arr[st],arr[st+1]);
        for(int i = st+2;i<=ed;i++){
            int rob = arr[i] + dp[i-2];
            int drob = dp[i-1];
            dp[i] = Math.max(rob,drob);
        }
        return dp[ed];
    }
    public static void main(String args[]){
        int[] arr = new int[]{2,7,9,3,1};
        house_rob2 obj = new house_rob2();
        System.out.println(obj.rob(arr));
    }
}
