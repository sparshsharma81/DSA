import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int first = 0;
            int second =0;
            for(int i=0;i<3;i++){
                int a = Character.getNumericValue(s.charAt(i));
                first+=a;
            }
             for(int i=3;i<6;i++){
                int a = Character.getNumericValue(s.charAt(i));
                second+=a;
            }
            if(first == second)System.out.println("YES");
            else System.out.println("NO");

        }
    }
}