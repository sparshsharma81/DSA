import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]] = i+1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
            if(i !=n-1)System.out.print(" ");
        }

    }
}
