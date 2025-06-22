import java.util.*;
public class display_stack_using_recurssion {
    static Stack<Integer>s2 = new Stack<>();
    public static void stack(Stack<Integer>st){
       if(st.isEmpty())return;
       s2.push(st.pop());
       stack(st);
    }
    //here we can use recurssion to print the stack
    public static void main(String args[]){
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.print("Print the stack" + st);
         //in java --- it is pass by reference..
         //mtlb ki agar ham java me void me koi function banahege..
         //to vo pass by value hi hoga..
         System.out.print(s2);
         System.out.println("Now after working");
         stack(s2);
         System.out.println(s2);
    }
}
