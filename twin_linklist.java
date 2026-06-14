public class twin_linklist{
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
class Solution {
    public int pairSum(ListNode head) {
        //so this question means that we need to check each twin node sum
        //node 1= n - 1 - node1;
        int count =0;
        ListNode slow =head;
        ListNode fast = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        

        //since the nodes are even...
        //so count*2 = size of ListNode

        int size = count*2;
        ListNode temp = head;
        int[]arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = head.val;
            head = head.next;
        }

        //now all the values of listnode is copied into the array
        int current =0;
        int max =0;

        for(int i=0;i<size;i++){
            current = Math.max(arr[i]+ arr[size-1-i],current);
        }
        return current;
    }
}
}