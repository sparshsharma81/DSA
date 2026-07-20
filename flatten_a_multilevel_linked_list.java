public class flatten_a_multilevel_linked_list{
    /*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

     public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        
        // Helper function to flatten a node and its children
        flattenNode(head);
        
        return head;
    }
     private Node flattenNode(Node node) {
        Node current = node;
        Node tail = node; // To keep track of the tail of the flattened list
        
        while (current != null) {
            if (current.child != null) {
                Node child = current.child;
                current.child = null;
                
                // Flatten the child list and get the child list's tail
                Node childTail = flattenNode(child);
                
                // Connect the current node to the flattened child
                childTail.next = current.next;
                if (current.next != null) {
                    current.next.prev = childTail;
                }
                current.next = child;
                child.prev = current;
                
                // Update the tail to be the tail of the merged list
                tail = childTail;
            }
            
            // Move to the next node in the original list
            current = current.next;
            if (current != null) {
                tail = current; // Update the tail for non-null current nodes
            }
        }
        
        return tail; // Return the tail of the merged list
    }
}