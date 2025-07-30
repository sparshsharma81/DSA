import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        int a = s.length();
        int z =0;
        for(int i=0; i<a; i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                z++;
            }
        }
        if(z == 7 || z ==4)System.out.println("YES");
        else System.out.println("NO");
    }
}