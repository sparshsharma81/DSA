package Exam;

import java.util.ArrayList;
 

public class BFS {
    
    
    static class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
    public static void bfs(Node root,java.util.ArrayList<ArrayList<Integer>>result){
        if(root == null)return;
        //nikal pehli fursat me 
        java.util.Queue<Node>q = new java.util.ArrayDeque<>();
        ArrayList<ArrayList<Integer>>fin = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> h1 = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr == null) continue;
                h1.add(curr.data);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            // add the level we built into the caller-provided result list
            result.add(h1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        java.util.ArrayList<ArrayList<Integer>>result = new java.util.ArrayList<>();
        bfs(root, result); //now we will write code to print the bfs of this
        System.out.println(result);

    }
    
}
