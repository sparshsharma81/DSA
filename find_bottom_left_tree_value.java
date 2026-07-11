public class find_bottom_left_tree_value {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int leftmostValue = root.val;

        while (!queue.isEmpty()) {
            int size = queue.size();
            leftmostValue = queue.peek().val; // Update leftmost value at the start of each level

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.poll();

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }

        return leftmostValue;
    }
}