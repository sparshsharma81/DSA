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
    private int size(ListNode head){
        int size =0;
        ListNode h1 = head;
        while(h1!=null){
            size++;
            h1 = h1.next;
        }
        return size;
    }
    private ListNode rotate(ListNode head){
        int size =0;
        ListNode h1 = head;
        while(h1!=null){
            size++;
            h1 = h1.next;
        }
        ListNode l2 = head;
        int[]arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = l2.val;
            l2 = l2.next;
        }
        

        ListNode l3 = new ListNode(arr[size-1]);
        ListNode l4 = l3;
        int size2 = 0;
        while(size2!=size-1){
            l3.next = new ListNode(arr[size2++]);
            l3 = l3.next;
        }
        return l4;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;

        int n = size(head);
        if(n == 1)return head;
        k = k % n;
        ListNode n2 = new ListNode();
        while(k-- >0){
           head = rotate(head);

        }
        return head;
    }
}