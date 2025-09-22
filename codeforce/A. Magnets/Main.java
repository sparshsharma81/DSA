import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        String prev = sc.nextLine();
        int groups = 1;
        
        for (int i = 1; i < n; i++) {
            String curr = sc.nextLine();
            if (!curr.equals(prev)) {
                groups++;
            }
            prev = curr;
        }
        
        System.out.println(groups);
    }
}
