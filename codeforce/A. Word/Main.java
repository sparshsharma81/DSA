import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int up = 0, low = 0;
        String s = sc.next();
       for(int i=0;i<s.length();i++){
        if(Character.isUpperCase(s.charAt(i))){
            up++;
        }
        else low++;
       }
       if(up > low){
           System.out.println(s.toUpperCase());
       } else {
           System.out.println(s.toLowerCase());
       }
    }
}
