import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int t = sc.nextInt();
     while(t-->0){
     int a =sc.nextInt();
     int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e =0;

        if(b > a)e++;
        if(c > a)e++;
        if(d > a)e++;
        System.out.println(e);
     }
    }
}