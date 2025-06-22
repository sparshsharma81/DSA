import java.util.*;
public class move_stack_in_same_order {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Stack<Integer>s1 = new Stack<>();
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int a = sc.nextInt();
            s1.push(a);
        }
        System.out.println(s1);
        //now this is our stack..
        //and we are putting the element to other stack
        Stack<Integer>st2 = new Stack<>();
        while(s1.size() > 0){
            int x = s1.pop();
            st2.push(x);
        }
        System.out.print("Now the second stack is : " + st2);
    }
}
