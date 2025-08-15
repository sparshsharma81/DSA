import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =0;
        while(true){
            if(a>b){
                System.out.println(c);
                break;
            }
            a*=3;
            b*=2;
            c++;
        }
    }
}
