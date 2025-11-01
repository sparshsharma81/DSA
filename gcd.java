import java.util.Scanner;
public class gcd{
    public static int gcd(int a , int b){
        if(a == 0)return b;
        return gcd(b %a  , a);
    }
    public static void main(String args[]){
        //now we will find the gcd of two numbers
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}