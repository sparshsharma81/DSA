import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        int sum =0;
        for(int i=0;i<a;i++){
            sum += (max - arr[i]);
        }
        System.out.println(sum);
    }
}
