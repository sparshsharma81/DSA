public class longest_path_in_a_matrix{
    
    static int[][] dp;
    static int n;
    static int m;
    static int[][] dr = {{0,1},{0,-1},{1,0},{-1,0}};
    static int dfs(int[][] mat,int i, int j){
        if(dp[i][j] != -1)return dp[i][j];
        int best = 1;
        for(int[] d : dr){
            int nx = i + d[0];
            int ny = j + d[1];

            if(nx >= 0 && ny >=0 && nx<n && ny<m && mat[nx][ny] > mat[i][j]){
                best =  Math.max(best,1+dfs(mat,nx,ny));
            }

        }
        return dp[i][j] = best;
    }
    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        dp = new int[n][m];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans = Math.max(ans,dfs(matrix,i,j));
            }

        }
        return ans;
    }