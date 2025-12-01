// package Exam;
import java.util.*;
public class Brand_Logo_Name {
    


    static char companyLogo(String husbandName, String wifeName) {
        // Write your code here
        if (husbandName.length() == 0 || wifeName.length() == 0) return 'r'; 
        
        HashSet<Character> st = new HashSet<>();
        
        for (char c : husbandName.toCharArray()) {
            st.add(c);
        }

        char ch = '#';
        int max = Integer.MAX_VALUE;
        
        for (char c : wifeName.toCharArray()) {
            if (st.contains(c)) {
                int a = (int)c - 97;
                max = Math.min(a, max);
            }
        }
        
        if (max == Integer.MAX_VALUE) {
            return 'h';
        }
        
        // System.out.println((char)(max + 97));
        return (char)(max + 97);
    }
}

