import java.util.*;
public class SIEVE_OF_ERATOSTHENES {
    
    public static void main(String[] args) {
        // int n = 30; // Example input
        // boolean[] isPrime = new boolean[n + 1];
        
        // // Initialize all entries as true. A value in isPrime[i] will
        // // finally be false if i is Not a prime, else true.
        // for (int i = 2; i <= n; i++) {
        //     isPrime[i] = true;
        // }
        
        // for (int p = 2; p * p <= n; p++) {
        //     // If isPrime[p] is not changed, then it is a prime
        //     if (isPrime[p]) {
        //         // Update all multiples of p
        //         for (int i = p * p; i <= n; i += p) {
        //             isPrime[i] = false;
        //         }
        //     }
        // }
        
        // // Print all prime numbers
        // System.out.println("Prime numbers up to " + n + ":");
        // for (int i = 2; i <= n; i++) {
        //     if (isPrime[i]) {
        //         System.out.print(i + " ");
        //     }
        // }


        ///NOW WE GONNA START THE WORK 
        
        Scanner sc = new Scanner(System.in);
        // int n=  sc.nextInt();
        int n = 10;
        //we gonna find all prime numbers till 30


        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        //we assume all prime numbers are true
         
        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j =i*i;j<=n;j+=i){
                    isPrime[j] =false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
}