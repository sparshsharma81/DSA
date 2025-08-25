import java.util.*;

public class Main{
    private static int check(int[] arr){
        HashMap<Integer,Integer>h1 = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        int repeat =0;
        for(Map.Entry<Integer,Integer>h: h1.entrySet()){
            int a1 = h.getKey();
            int b = h.getValue();
            if(b>=3)repeat = a1;
            return a1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)arr[i] = sc.nextInt();
            int repeat = check(arr);
            System.out.println(repeat);
        }
    }
}