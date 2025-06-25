public class balance_bracket {
    public static boolean isBalance(String s){
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')' && st.isEmpty())return false; 
            if(s.charAt(i) =='(') st.push('(');
             if(s.charAt(i) == ')') st.pop(); 

        }
        return st.isEmpty();
    }
    public static void main(String args[]){
        //we are solving the balance bracket problems..
        //rule -- if open bracket... -- push it /
        String s = "((())))";
        System.out.print(isBalance(s));
        
    }
}
