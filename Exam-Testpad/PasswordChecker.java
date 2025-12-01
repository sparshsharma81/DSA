import java.util.*;
public class PasswordChecker {
    public static void generate(String s, ArrayList<String> st, int i){
        // generateHelper(s.toCharArray(), 0, st);

        if(i ==s.length()){
            st.add(s);
            return;
        }
        char up = Character.toUpperCase(s.charAt(i));
                char low1 = Character.toLowerCase(s.charAt(i));

        String upper = s.substring(0,i) +up +  s.substring(i+1,s.length());
        String low = s.substring(0,i) + low1 +  s.substring(i+1,s.length());
        generate(upper,st,i+1);
        generate(low,st,i+1);
        
    }

    public static void main(String [] args){

        String s="abc";
        ArrayList<String>st = new ArrayList<>();
        generate(s,st,0);
        System.out.println(st);
    }
}
