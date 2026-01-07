import java.util.*;
public class Prime_Factorisation {
    private static void run1(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i ==0){
                System.out.println(i);
                n/=i;
            }
        }
        if(n>1)System.out.println(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println();
        run1(a);
    }
}
