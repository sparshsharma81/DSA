import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            int b = sc.nextInt();
            int[] arr = new int[b];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int curr =0;
            int max =0;
            for(int i=0;i<b;i++){
                if(arr[i] == 0)curr++;
                if(arr[i] == 1){
                    max = Math.max(curr,max);
                    curr = 0;
                }
            }
            max = Math.max(curr,max);
            System.out.println(max);
            
        }
    }
}