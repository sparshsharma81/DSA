import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-->0){
            String s = sc.next();
            int a1 = 0;
            for(char c : s.toCharArray()){
                if(c == 'A')a1++;
                
            }
            if(a1 >= 3)System.out.println("A");
            else System.out.println("B");
        }
    }
}