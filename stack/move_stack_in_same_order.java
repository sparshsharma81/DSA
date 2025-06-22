import java.util.*;
public class move_stack_in_same_order {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Stack<Integer>s1 = new Stack<>();
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        for(int i=1;i<n;i++){
            int a = sc.nextInt();
            s1.push(a);
        }
        System.out.println(s1);
        
    }
}
