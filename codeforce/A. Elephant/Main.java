import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        while(n<=5){
            ans += (n/5);
            n/=5;
        }
        System.out.println(ans+1);
        sc.close();
    }
}