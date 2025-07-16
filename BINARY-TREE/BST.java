import java.util.*;
public class BST{
    static class Node{
        int val;
        Node left;
        Node right;


        Node(int val){
            this.val = val;
        }
    }
    //hamne return type ko node rakha hai..kyuki ham recurrsively insert karege...
    public static Node insert(Node root, int val){
        if(root == null){
             root = new Node(val);
             return root;
        }

        if(root.val > val){
            //left subtree
           root.left =  insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    //now we are writing the code for search in BST
    public static boolean search(Node root,int key){
        // else return false;
        if(root == null)return false;
        if(root.val > key){
            return search(root.left,key);
        }
        else if(root.val < key){
            return search(root.right,key);
        }
        else if(root.val == key) return true;
        else return true;
        
    }

    //now we are implementing the deleting the node code
    public static Node delete(Node root, int val){
        
    }

    public static void main(String args[]){
        int[] values = {1,2,3,4,5};
        Node root = null;
        System.out.println("The code is workinng");
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        
        inorder(root);
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        boolean exist = search(root,a);
        System.out.println("The answer is : " + exist);
    }
}