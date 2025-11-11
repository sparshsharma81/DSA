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
    //we neeed to make a pair and add 3 values in it
    int hd; //horizontal distance 
    int lvl; //to track the level ;
    TreeNode node;
    Pair(int hd, int lvl , TreeNode node){
        this.hd = hd;
        this.lvl = lvl;
        this.node = node;
    }
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map = new TreeMap<>();
        Queue<Pair>q = new LinkedList<>();
        q.add(new Pair(0,0,root));

        while(!q.isEmpty()){
            Pair curr = q.poll();
            map.putIfAbsent(curr.hd, new TreeMap<>());
            map.get(curr.hd).putIfAbsent(curr.lvl,new PriorityQueue<>());
            map.get(curr.hd).get(curr.lvl).add(curr.node.val);

            if(curr.node.left !=null){
                q.add(new Pair(curr.hd-1,curr.lvl+1,curr.node.left));

            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.lvl+1,curr.node.right));
            }
        }
            List<List<Integer>>ans = new ArrayList<>();
            for(TreeMap<Integer,PriorityQueue<Integer>>h : map.values()){
                List<Integer>col = new ArrayList<>();
                for(PriorityQueue<Integer>pq : h.values()){
                    while(!pq.isEmpty()){
                        col.add(pq.poll());
                    }
                }
                ans.add(col);
            }
            return ans;
        
    }
}