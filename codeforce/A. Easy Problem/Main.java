import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a =1;
            int b = n -1 ;
            int c=0;
            while(a !=b){
                a++;
                b--;
                c++;
            }
            System.out.print(c);
        }
    }
}
