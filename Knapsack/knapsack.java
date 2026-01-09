package Knapsack;

public class knapsack {
    public int knapsack(int[] weight, int[] value , int k){
    //k --> the capacity
    int n = weight.length;
    int[][] dp = new int[weight.length+1][k+1];
    //now the first row and first col =0; cause 
    // 0 item -- 0 dp[0][W]
    // capacity ->0 dp[i][0] = 0;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=k;j++){

            //take case
            int take = dp[i-1][j];
            dp[i][j] = take;

            //not take
            if(weight[i-1] <= j){
                int v1 = value[i-1] + dp[i-1][j - weight[i-1]];
                int v2 = Math.max(take,v1);
                dp[i-1][j] = v2;
            // int not = Math.max(take , value[i-1][j] + dp[i-1][j - weight[i-1]]);
            }

        }
    }
    return dp[n][k];
    }
    public static void main(String args[]){

    }
}
