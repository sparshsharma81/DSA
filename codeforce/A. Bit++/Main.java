import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer input///
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextLine();
        }
        int n1 =0;
        for(int i=0;i<n;i++){
            if(s[i].equals("++X") || s[i].equals("X++")){
                n1++;
            }else{
                n1--;
            }
        }
        System.out.println(n);
    }
}
