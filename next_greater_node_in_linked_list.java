import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class next_greater_node_in_linked_list {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
     public static ArrayList<Integer> fng(ArrayList<Integer> nums) {
        int n = nums.size();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(n, 0));
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int current = nums.get(i);

            // Remove all elements smaller or equal to current from the stack
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }

            // If stack is not empty, then the top is the next greater
            if (!stack.isEmpty()) {
                result.set(i, stack.peek());
            }

            // Push the current element onto stack
            stack.push(current);
        }

        return result;
    }
    public int[] nextLargerNodes(ListNode head) {
     ArrayList<Integer>h1 = new ArrayList<>();
     ListNode temp2 = head;
     while(temp2!=null){
        h1.add(temp2.val);
        temp2 = temp2.next;
     }
     h1 = fng(h1);
     int[] arr2 = new int[h1.size()];
     for(int i=0;i<h1.size();i++){
        arr2[i] = h1.get(i);
     }
     return arr2;

    }
}
