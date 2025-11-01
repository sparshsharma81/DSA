public class nqueen {
    private static boolean isSafe(char[][] board, int row, int col) {
        // Check this column on upper side
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // Check upper diagonal on right side
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }
    public static void main(String args[]){
        String[][] boards = {{"Q...","...Q","..Q.","..Q."}, {"..Q.","Q...","...Q",".Q.."}};

        for(String[] board : boards){
            for(String row : board){
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
