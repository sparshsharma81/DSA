import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
        String s= sc.next();
        String a = sc.next();
        System.out.println(a.charAt(0) + s.substring(1) + " " + s.charAt(0) + a.substring(1));
        }
    }
}