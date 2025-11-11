import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        // Root (except if it's a leaf)
        if (!isLeaf(root)) res.add(root.val);

        // Left boundary (excluding leaves)
        addLeftBoundary(root.left, res);

        // All leaf nodes
        addLeaves(root, res);

        // Right boundary (excluding leaves, reversed)
        addRightBoundary(root.right, res);

        return res;
    }

    private boolean isLeaf(TreeNode node) {
        return (node.left == null && node.right == null);
    }

    private void addLeftBoundary(TreeNode node, List<Integer> res) {
        while (node != null) {
            if (!isLeaf(node)) res.add(node.val);
            if (node.left != null) node = node.left;
            else node = node.right;
        }
    }

    private void addRightBoundary(TreeNode node, List<Integer> res) {
        Stack<Integer> st = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) st.push(node.val);
            if (node.right != null) node = node.right;
            else node = node.left;
        }
        while (!st.isEmpty()) res.add(st.pop());
    }

    private void addLeaves(TreeNode node, List<Integer> res) {
        if (isLeaf(node)) {
            res.add(node.val);
            return;
        }
        if (node.left != null) addLeaves(node.left, res);
        if (node.right != null) addLeaves(node.right, res);
    }
}
