public class push_at_bottom {
    public class Stack<Integer> push(Stack<Integer>s1,int x){
        if(s1.isEmpty()){
            s1.push(x);
            return s1;

        }
        int x1 = s1.pop();
        push(s1,x);
        s1.push(x1);
    }
    //in these recurssion...call stack is calling..so space complexicity is O(n)
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 0); // Push 0 at the bottom

        System.out.println(stack); // Output: [0, 1, 2, 3]
    }
}
