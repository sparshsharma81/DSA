
import java.util.Scanner;
public class permutationofSTring {
    private static void perm(String p, String up){
        if(up.length() == 0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        perm(p+ch,up.substring(1));
        perm(p,up.substring(1));
    }
    private static void permutation(String s, String up){
        if(up.length() == 0){
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i,up.length());
            permutation(s1+ch+s2, up.substring(1));
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = "abc";
        perm("",s);
        System.out.println("And");
        permutation("", s);
    }
}
