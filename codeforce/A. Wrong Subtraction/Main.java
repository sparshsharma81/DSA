import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();//we need to make b =0;
        while(b!=0){
            int a1 = a%10;
            if(a1 ==0){
                a/=10;
                b-=1;
            }
            else if(b - a1 >= 0){
                b -= a1;
                a-=a1;
            }

        }
        System.out.print(a);
    }
}