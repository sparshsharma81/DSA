// package Dynamic Programming;

public class Coin_Change {
    public static void main(String args[]){
        int[] coins = {1,2,5};
        int amount = 11;
        int[] dp = new int[amount + 1];
        for(int i=1;i<dp.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int coin : coins){
            for(int i=coin;i<dp.length;i++){
                if(dp[i - coin] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        if(dp[amount] == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(dp[amount]);
        }
    }
}
