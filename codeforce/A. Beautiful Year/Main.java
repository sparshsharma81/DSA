import java.util.*;
public class Main{
    public static boolean isTrue(int n){
        int[] arr = new int[10];
        while(n>0){
            int digit = n%10;
            if(arr[digit] == 1) return false;
            arr[digit] = 1;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n1 =1;
        int b = a+1;
        while(n1!=0){
            if(isTrue(b)){
                System.out.println(b);
                break;
            }
            b++;
        }
    }
}