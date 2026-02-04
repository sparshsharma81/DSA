public class nqueen2 {
    //thus we return nqueen2
    static int c=0;
    private static void start(char[][] grid, int row){
        int n = grid.length;
        if(row == n){
            c++;
            return;
        }

        for(int col =0 ;col <n;col++){
            if(isSafe(grid,row,col)){
                grid[row][col] = 'a';
                start(grid,row+1);
                grid[row][col] = '.';
            }

        }


    }
   
    private static boolean isSafe(char[][] grid, int i1, int j1){
        int n = grid.length;
        
        for(int i=0;i<n;i++){
            if(grid[i1][i] != '.')return false;
        }

        //now we check the col
        for(int i =0;i<n;i++){
            if(grid[i][j1] != '.')return false;
        }

        //now the diagonal check
        for(int i=i1,j = j1;i>=0 && j<n; i--,j++){
            if(grid[i][j] != '.')return false;
        }
          for(int i=i1,j = j1;i>=0 && j>=0; i--,j--){
            if(grid[i][j] != '.')return false;
        }
        for(int i=i1,j=j1;i<n&&j>0;i++,j--){
              if(grid[i][j] != '.')return false;
        }
        
        return true;
        // if(c==0)return false;
    }
    public int totalNQueens(int n) {
        //now the distint ways <=n
        char[][] grid = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = '.';
            }
        }
         c= 0;

        start(grid,0);
        return c;

    }
  

}
