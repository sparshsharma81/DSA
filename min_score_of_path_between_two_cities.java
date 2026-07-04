class min_score_of_path_between_two_cities{
    class Solution {
    static class Pair{
        int node;
        int val;
        Pair(int node, int val){
            this.node = node;
            this.val = val;
        }
    }
    private static int count(ArrayList<ArrayList<Pair>>adj,int n, int target){
        boolean[] vis = new boolean[n+1];
        Queue<Integer>q = new LinkedList<>();
        q.offer(1);
        int min = Integer.MAX_VALUE;
        vis[1] = true;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(Pair ne1 : adj.get(curr)){
                int ne = ne1.val;
                int n3 = ne1.node;
                min = Math.min(min,ne);
             
                if(!vis[n3]){
                    q.offer(n3);
                    vis[n3] = true;
                }
            }
        }
        return min;

    }
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>>adj = new ArrayList<>();
        for(int i=0;i<=n;i++)adj.add(new ArrayList<>());

        for(int i=0;i<roads.length;i++){
            int a = roads[i][0];
            int b = roads[i][1];
            int wt = roads[i][2];
            adj.get(a).add(new Pair(b,wt));
            adj.get(b).add(new Pair(a,wt));
        }
        int min = count(adj,n,n-1);
        return min;
        

    }
}
}