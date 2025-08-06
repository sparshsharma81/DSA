import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int b =0;
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i=0;i<n;i++){
                if(arr[i] % 2 == 0){
                    if(i % 2 != 0){
                        a++;
                    }
                }
                else{
                    if(i % 2 == 0){
                        b++;
                    }
                }
            }
            if(a == b){
                System.out.println(a);
            }
            else{
                System.out.println(-1);
            }
        }
        
        
    }
}