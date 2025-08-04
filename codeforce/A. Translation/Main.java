import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        String s2 = sc.next();
        StringBuilder sb = new StringBuilder(s2);
        if(sb.reverse().toString().equals(s)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}