import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) sb.append("I hate");
            else sb.append("I love");

            if (i < n) sb.append(" that ");
            else sb.append(" it");
        }

        System.out.println(sb.toString());
    }
}
