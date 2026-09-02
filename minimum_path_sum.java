public class minimum_path_sum{
    private static int solve(int[][] grid, int i , int j , int[][] dp){
        if(i ==0 && j ==0)return grid[0][0];
        if(i <0 || j<0)return 999999;
        if(dp[i][j] != -1)return dp[i][j];
        int left = solve(grid,i,j-1,dp);
        int up = solve(grid,i-1,j,dp);
        return dp[i][j] = grid[i][j] + Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int[][] dp  = new int[grid.length][grid[0].length];
        // for(int i=0;i<grid.length;i++)
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j] = -1;
            }
        }
        int b = solve(grid,grid.length-1,grid[0].length-1,dp);
        return b;
}
}