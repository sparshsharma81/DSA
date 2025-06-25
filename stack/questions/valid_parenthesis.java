public class valid_parenthesis {
    private static boolean balance(String s){
        if(s.length() %2 !=0)return false;
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')st.push(ch);
            else{
                if(st.isEmpty())return false;
                char top = st.peek();
                if(ch == '(' && top == ')')st.pop();
                if(ch == '{' && top == '}')st.pop();
                if(ch == '[' && top == ']') st.pop();
                else return false;

            }
        }
        return st.isEmpty();
    }

    public static void main(String args[]){
        //now we are solving the problem of valid parenthesis...
        //leetcode -20 valid parenthesis...

        ///we are given brackets.. we need to check if string is closed by the same type of brackets
        String s = "";
        System.out.println(balance(s));
    }
}
