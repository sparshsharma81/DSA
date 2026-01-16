class Surrounded_Region {
    private static void dfs(char[][] board, int i, int j){
        if(i < 0 || j <0 || i>=board.length || j >=board[0].length || board[i][j] != 'O')return;
        if(board[i][j] == 'O'){
            // count++; //since board[i][j] =O;
            board[i][j] = 't';

        }
        
        dfs(board,i,j-1);
        dfs(board,i,j+1);
        dfs(board,i-1,j);
        dfs(board,i+1,j);
        
    }
     private static void dfs2(char[][] board, int i, int j){
        if(i < 0 || j <0 || i>=board.length || j >=board[0].length || board[i][j] == 'X')return;
        if(board[i][j] == 'O'){
            // count++; //since board[i][j] =O;
            // board[i][j] = 't';
            board[i][j] = 'X';

        }
        
        dfs2(board,i,j-1);
        dfs2(board,i,j+1);
        dfs2(board,i-1,j);
        dfs2(board,i+1,j);
        
    }
    public void solve(char[][] board) {
        //now the dfs work is done..we can check the sample
        int n= board.length;
        int m = board[0].length;

        for(int i=0;i<m;i++){
            if(board[0][i] == 'O')dfs(board,0,i);
        }
        for(int i=0;i<m;i++){
            if(board[n-1][i] == 'O')dfs(board,n-1,i);
        }
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O')dfs(board,i,0);
        }
            for(int i=0;i<n;i++){
            if(board[i][m-1] == 'O')dfs(board,i,m-1);
        }
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board[0].length;j++){
        //         i
        //     }
        // }
          for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'O'){
                    dfs2(board,i,j);
                }
            }
        }

            for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 't'){
                    // dfs2(board,i,j);
                    board[i][j] = 'O';
                }
            }
        }

    }
}