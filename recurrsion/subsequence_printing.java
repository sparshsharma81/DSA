import java.util.*;
public class subsequence_printing{
    public static HashSet<String>h1;
    public static void subsequence(String p, String up,HashSet<String>h1){
        if(up.isEmpty()){
            // System.out.print(p + " ");
            h1.add(p.toString());
            return;
        }
        char ch = up.charAt(0);
        subsequence(p+ch, up.substring(1),h1);
        subsequence(p, up.substring(1),h1);

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String>h1 = new HashSet<>();
        subsequence("", s,h1);
        System.out.print(h1);
    }
}