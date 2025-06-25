public class remove_bracket_to_balance_string {
    public static int balanced(String s){
        int c =0;
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty() && ch == ')')c++;
            if()
        }
    }
    public static void main(String args[]){
        //now we need to find out the minimum number of brackets to be removed in order to balance the string...
        String s = "()(()))))";
        System.out.print(balanced(s));
    }
}
