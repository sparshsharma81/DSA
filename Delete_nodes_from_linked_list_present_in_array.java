public class Delete_nodes_from_linked_list_present_in_array{
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>h1 = new HashSet<>();
       for(int i : nums)h1.add(i);
       ListNode head2 = head;
       ListNode head4 = head2;
       while(head2.next!=null){
        int a = head2.next.val;
        int b = head2.val;
        if(h1.contains(a)){
            head2.next = head2.next.next;
        }
        else head2 = head2.next;
       }
    //    System.out.println(head4);
    // while(head4!=null){
    //     System.out.print(head4.val + " ");
    //     head4 = head4.next;
    // }

    int a4 = head4.val;
    if(h1.contains(a4))return head4.next;
    return head4;
    //    ListNode head3 = head2;
    //    return head3;
    }
}
