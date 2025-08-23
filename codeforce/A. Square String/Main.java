import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            char[] arr = new char[26];
            for(char c : s.toCharArray()){
               arr[(int)c - 97]++;
            }
            int n4 =1;
            for(int i : arr){
                if(i % 2 !=0){
                    n4 = 0;
                    System.out.println("No");
                    break;
                }
            }
            if(n4 == 1)System.out.println("Yes");
        }
    }
}
