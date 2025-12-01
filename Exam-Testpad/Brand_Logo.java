// package Exam;

public class Brand_Logo {
    public static char Brand(String husbandName, String wifeName) {
        if (husbandName.length() == 0 || wifeName.length() == 0) return 'r'; 
        
        java.util.HashSet<Character> st = new java.util.HashSet<>();
        
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
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String hus = "satish";
        String wife = "leemz";
        char ans = Brand(hus,wife);
        System.out.println(ans);

    }
}
