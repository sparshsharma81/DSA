public class valid_sudoku{
    private  boolean check(int a, int b,char[][] board){
        HashSet<Character>h1 = new HashSet<>();
        System.out.println(board[a][b]);
        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                 if(board[i][j] != '.'){
                if(h1.contains(board[i][j]))return false;
                h1.add(board[i][j]);
                 }
            }

        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        //first we check for each row
       for(int i=0;i<9;i++){
        HashSet<Character>h = new HashSet<>();
        for(int j=0;j<9;j++){
            if(board[i][j] != '.'){
                if(h.contains(board[i][j]))return false;
            else h.add(board[i][j]);
            }
        }
       }
       System.out.println("First pass");

       //now we check for each column
       for(int i=0;i<9;i++){
        HashSet<Character>h = new HashSet<>();
        for(int j=0;j<9;j++){
             if(board[j][i] != '.'){
            if(h.contains(board[j][i]))return false;
            else h.add(board[j][i]);
             }
        }
       }
          System.out.println("Second pass");

       
   for(int i=0;i<9;i+=3){
    for(int j=0;j<9;j+=3){
        if(!check(j,i,board))return false;
    }
   }
   return true;
       //now till now...if we have reached now..now we need to check 
       //for all 9 3*3 matrix
       
    }

}