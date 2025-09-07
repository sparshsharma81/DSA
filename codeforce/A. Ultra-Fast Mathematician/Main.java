import java.util.Scanner;
public class Main{
    public static String check(String a , String b){
        int c =0;
        String s = "";
        while(c<a.length()){
            if(a.charAt(c) != b.charAt(c)){
                s+="1";

            }
            else s+="0";
            c++;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        String b = sc.next();
        String c = check(s, b);
        System.out.println(c);

    }
}