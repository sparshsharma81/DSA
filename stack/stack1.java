public class stack1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
        //now this is a linkedlist implementation..we are implementing the stack using linked list
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null; 
        }
        public static void push (int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty())return ;
            int top = head.data;
            head= head.next;
            return top;
        }
    }
public static void main(String args[])    {
    //stack mainly has three operations --- push pop peek
    //these opeartions normally take O(1) time complexicity 
    //we can implement it with ararylist and linkedlist..also array..but it is quite complex
     //arraylist-- if it reach the limit..then it is doubled...


}
}
