import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){ 
            int n =sc.nextInt();
            int y = sc.nextInt();
            if(n % y == 0)System.out.println("0");
            else{
                int x = n/y;
                System.out.println(y - (n - (x * y)));

            }
        }
    }
}