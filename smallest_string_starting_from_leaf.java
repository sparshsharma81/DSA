public class smallest_string_starting_from_leaf{
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
    public static ArrayList<ArrayList<Character>>a;
         private static void find(TreeNode root, ArrayList<Character> arr) {
        arr.add((char)(root.val + 97)); // ✅ add current node to path

        if(root.left == null && root.right == null){
            a.add(new ArrayList<>(arr)); // ✅ store a copy of current path
            arr.remove(arr.size() - 1);  // ✅ backtrack
            return;
        }        

        if(root.left != null)
            find(root.left, arr);
        if(root.right != null)
            find(root.right, arr);

        arr.remove(arr.size() - 1); // ✅ backtrack after exploring both sides
    }
        public String smallestFromLeaf(TreeNode root) {
            a = new ArrayList<>();
            ArrayList<Character>aqq = new ArrayList<>();
            find(root,aqq);
            PriorityQueue<String>pq = new PriorityQueue<>();
            for(ArrayList<Character>a1 : a){
                // char f = (char)(root.val+97);
                StringBuilder s1 =new StringBuilder();
                // s1.append(f);
                for(int i=0;i<a1.size();i++){
                    s1.append(a1.get(i));
                }
                pq.add(s1.reverse().toString());
            }
            // 
            // System.out.println(aqq);
            return pq.poll();
        }
}