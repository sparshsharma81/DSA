import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            int sum =0;
            for(int i : arr){
                sum+=i;
            }
           for(int i=0;i<size-1;i++)System.out.print(arr[i]+ " ");
           System.out.print(arr[size-1]);
           System.out.println();

        }
    }
}