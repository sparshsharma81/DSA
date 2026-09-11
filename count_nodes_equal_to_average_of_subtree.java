class Solution {
    private static int c =0;
    private static int count(TreeNode root){
        if(root == null)return 0;
      return root.val + count(root.left) + count(root.right);
    }
    private static int sum(TreeNode root){
        if(root == null)return 0;
        return 1 + sum(root.left) + sum(root.right);
    }
    private static int avg(TreeNode root){
        if(root == null)return 0;
        int count = count(root);
        int sum = sum(root);
         int avg = (int)(count/sum);
        return avg;
    }
    private static void eval(TreeNode root, int av){
        if(root == null)return;
        int curr = avg(root);
        if(curr==root.val)c++;
        eval(root.left,av);
        eval(root.right,av);
        // return find(root) + find(root.left) + find(root.right);
    }
    // private static int calculate(TreeNode root, int avg){
    //     if(root == null)return;
    //     int left = calculate(root.left,avg);
    //     int right = calculate(root.right,avg);

    // }
    public int averageOfSubtree(TreeNode root) {
        c =0;
        int a = avg(root);
        eval(root,a);
        return c;

        
        // return a;
    }
}