import javax.swing.tree.TreeNode;

public class validate_binary_tree {
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
    class Pair{
        boolean isbst = true; //initiallly bst true hai kyuki vo null hai
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

    }
    private Pair solve(TreeNode root){
        if(root ==null)return new Pair();

        Pair left = solve(root.left);
        Pair right = solve(root.right);

        Pair self = new Pair();
        if(left.isbst && right.isbst && left.max < root.val && right.min > root.val){
            self.isbst = true;

         self.min = Math.min(root.val,Math.min(left.min,right.min));
         self.max = Math.max(root.val,Math.max(left.max,right.max));
        }
        else self.isbst = false;

        return self;
    }

    public boolean isValidBST(TreeNode root) {

       return solve(root).isbst;
        //from here we return a pair..and we has to return isbalance
      

    }
}
}
