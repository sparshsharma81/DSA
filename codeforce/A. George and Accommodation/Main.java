import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] arr = new int[n * 2];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0;i<arr.length;i+=2){
            int a = arr[i+1] - arr[i];
            if(a >2)count++;
        }
        System.out.println(count);
    }
}