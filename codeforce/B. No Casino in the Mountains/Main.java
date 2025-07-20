// package dsa-git.codeforce.B. No Casino in the Mountains;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[]arr = new int[n];
            int c =0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            //basically we need to find the max k consecutive 0
            int i=0;
            while(arr[i] !=0)i++;
            if(i==n)System.out.println("0");
            else{
                while(i!=n){
              
               int n3 =0;
               while(n3!=k || i!=n){
                n3++;
                i++;
                if(arr[i] ==1){
                    n3 = 0;
                    break;
                }
              }
            if(n3 ==k)c++;
            i++;//this is break;

               }
            }
            System.out.println(c);
        }
    }
}
