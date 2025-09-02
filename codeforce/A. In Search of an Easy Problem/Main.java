import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)arr[i] = sc.nextInt();
        boolean ans = false;
        for(int i : arr)if(i == 1)ans = true;
        if(ans)System.out.println("HARD");
        else System.out.println("EASY");
    }
}