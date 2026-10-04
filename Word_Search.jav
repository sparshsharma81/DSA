public class Word_Search{
    private static boolean work(char[][] board, String word, int i, int x, int y){
        int a1 = board.length;
        int a2 = board[0].length;

        if(x <0 || y <0 || x >=a1 || y >=a2 || i >= word.length() ||
         board[x][y] != word.charAt(i) || board[x][y] == '*' )return false;
        if(i == word.length()-1)return true;

        char ch = board[x][y];

        board[x][y] = '*';

        boolean ab =  work(board, word, i+1,x+1,y) || (work(board, word, i+1,x,y+1)) 
        || work(board, word, i+1,x-1,y) || work(board, word, i+1,x,y-1);

        //now we do horizontal search 

        board[x][y] = ch;
        return ab;
        
    }
    public boolean exist(char[][] board, String word) {
        //now we are given a word..we need to check whether it exist or not 

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(work(board,word,0,i,j))return true;
            }
        }
        return false;
    }
}