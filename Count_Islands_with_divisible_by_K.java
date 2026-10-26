public class Count_Islands_with_divisible_by_K {
    static int sum=0;
    private static void dfs(int[][] grid, int x, int y, int[][] arr){
        int i= x;
        int j = y;
        int n = grid.length;
        int m = grid[0].length;
        if(x<0 || y <0 || x>=n || y>=m || grid[x][y] == 0 || arr[i][j] ==1)return;
        arr[i][j] = 1;
         sum+=grid[i][j];
        grid[x][y] = 0;
       

        dfs(grid,x+1,y,arr);
         dfs(grid,x,y+1,arr);
          dfs(grid,x-1,y,arr);
         dfs(grid,x,y-1,arr);
    }


    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int ans =0;
        sum =0;
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0){
                    sum =0;
                    dfs(grid,i,j,arr);
                    if(sum ==0)continue;
                    if(sum % k == 0)ans++;

                }
            }
        }
        return ans;
}
}
