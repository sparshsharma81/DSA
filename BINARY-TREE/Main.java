// Node class
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

// BST class
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

    // Find minimum value in a tree (used in delete)
    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    // Delete a node
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // No child
            if (root.left == null && root.right == null)
                return null;

            // One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Two children – replace with inorder successor
            int minValue = findMin(root.right);
            root.data = minValue;
            root.right = delete(root.right, minValue);
        }
        return root;
    }
}

// Main class to test BST
public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) {
            tree.root = tree.insert(tree.root, val);
        }

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);  // Output: 20 30 40 50 60 70 80
        System.out.println();

        // Search
        System.out.println("Search 40: " + tree.search(tree.root, 40)); // true
        System.out.println("Search 100: " + tree.search(tree.root, 100)); // false

        // Delete
        tree.root = tree.delete(tree.root, 50);
        System.out.print("After deleting 50, inorder: ");
        tree.inorder(tree.root);  // Output: 20 30 40 60 70 80
    }
}
