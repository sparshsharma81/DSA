class BST {
    Node root;

    // Insert a node
    Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);
        return root;
    }

    // Inorder traversal (Left → Root → Right)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Search a value
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (key == root.data) return true;
        if (key < root.data)
            return search(root.left, key);
        return search(root.right, key);
    }
     public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);  // Output: 20 30 40 50 60 70 80

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));  // true
        System.out.println("Search 100: " + tree.search(tree.root, 100));  // false
    }
}
