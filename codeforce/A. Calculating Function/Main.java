import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum=0;
        // if(n % 2 ==0){
        //     n/=2;
        //     sum-=(n * n);
        //     sum+=(n * (n+1));
        //     System.out.println(sum); 
        // }
        // else{
        //     n/=2;
        //     sum-=((n-1)*(n-1));
        //     sum+=(n * (n+1));
        //     System.out.println(sum);
        // }
        long n = sc.nextLong();
        long ans = (n % 2 ==0)?(n/2):-((n+1)/2);
        System.out.println(ans);
        
    }
}
