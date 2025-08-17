import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int sum = a %10;
            a/=10;
            sum+=a%10;
            System.out.print(sum);
            
            // System.out.println( a%100);
            
        }
    }
}