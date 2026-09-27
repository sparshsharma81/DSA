import java.util.Stack;

public class Reverse_Substring_between_each_pair_of_Parenthesis{
    public String reverseParentheses(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                StringBuilder s2 = new StringBuilder();
                char a = 'i';
                while(a != '('){
                      a = st.pop();
                     s2.append(a);                   
                     
                }
                for(int i2=0;i2<s2.length()-1;i2++){
                    st.push(s2.charAt(i2));
                }
            }
            else st.push(ch);
        }
        System.out.println(st);

        StringBuilder s4 = new StringBuilder();
        while(st.size() !=0)s4.append(st.pop());
        return s4.reverse().toString();
    }
}