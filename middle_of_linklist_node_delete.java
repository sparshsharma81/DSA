public class middle_of_linklist_node_delete {
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
    public ListNode deleteMiddle(ListNode head) {
        //let us first count the size
        int size =0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int mid = size/2;
        if(mid == 0) return temp;
        int mid1 = mid -1;
        ListNode t2 = head;
        ListNode t1 = t2;
        while(mid1 !=0){
            t2 = t2.next;
            mid1--;
        }
        t2.next = t2.next.next;
        return t1;

    }
}