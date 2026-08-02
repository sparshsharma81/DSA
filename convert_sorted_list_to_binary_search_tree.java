import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class convert_sorted_list_to_binary_search_tree {


    private TreeNode helper(ArrayList<Integer>h1,int low, int high){
        if(low>high)return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(h1.get(mid));
        root.left = helper(h1,low,mid-1);
        root.right = helper(h1,mid+1,high);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer>h1 = new ArrayList<>();
        while(head!=null){
            h1.add(head.val);
            head = head.next;
        }
        return helper(h1,0,h1.size()-1);
    }
}
