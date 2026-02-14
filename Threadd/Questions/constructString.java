import javax.swing.tree.TreeNode;

public class constructString {
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
class Solution {
    private static String work(TreeNode root, String ans){
        if(root == null)return "";

        String a = "";
        a+= (root.val);

        if(root.left == null && root.right == null)return a;
        if(root.left == null && root.right !=null){
            return a + "()" + "(" + work(root.right, ans) + ")";
        }
        
        if(root.left != null && root.right == null){
            return a + "("+  work(root.left, ans) +")";
        }
        return a + "("+  work(root.left, ans) +")" + "(" + work(root.right, ans) + ")";
    }
    public String tree2str(TreeNode root) {
        String ans = "";
        ans = work(root,ans);
        return ans;
        
    }


}
}
