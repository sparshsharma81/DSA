import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        String a1 = "I hate it";
        String a2= "I love it";
        String c = "I hate that";
        String d = "I love that";
        while(a!=1){
            if(a>1)System.out.print(c);
            a--;
            if(a>1)System.out.print(d);
            a--;

        }
        if(b %2 != 0)System.out.print(a1);
        else System.out.print(a2);
    }
}