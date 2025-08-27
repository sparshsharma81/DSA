import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String s2 = "codeforces";
            char s3 = s.charAt(0);
            if(s2.indexOf(s3) !=-1){
                System.out.println("Yes");
                

            }
            else System.out.println("No");
        }
    }
}