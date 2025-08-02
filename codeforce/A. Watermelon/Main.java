import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n % 4 == 0)System.out.println("YES");
      else if(n % 4 == 1)System.out.println("NO");
      else if(n % 4 == 2)System.out.println("YES");
      else System.out.println("NO");
    }
}