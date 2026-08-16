public class subtree_of_another_tree{
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    private boolean check(TreeNode root,TreeNode sub){
        if(root == null && sub == null)return true;
        if(root == null || sub == null)return false;
       
           if(root.val == sub.val) return check(root.left,sub.left) && check(root.right,sub.right);
           return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
        if(subRoot == null)return true;
        if(root == null)return false;
        if(root.val == subRoot.val)if(check(root,subRoot))return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
       
 //       return false;
    }
}