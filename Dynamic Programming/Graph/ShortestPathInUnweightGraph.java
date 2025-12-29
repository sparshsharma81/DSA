import java.util.*;
public class ShortestPathInUnweightGraph {
    public static ArrayList<Integer>shortest(int V, int[][] edge, int src, int dest){
        //now we need to find the shortest path from source to destination
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int[] i : edge){
            //since it is undirected..so we take from both side
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }

        int[] parent = new int[V];
        Arrays.fill(parent,-1);
        // int[] dis = new int[dis];
        boolean[] vis = new boolean[V];
        vis[src] = true;

        Queue<Integer>q = new LinkedList<>();
        q.offer(src);

        while(!q.isEmpty()){
            int curr = q.poll();
            for(int ne : adj.get(curr)){
                if(!vis[ne]){
                    vis[ne] = true;
                    parent[ne] = curr;
                    q.offer(ne);

                }
                // if(ne == dest)break;
                // else{
                //     //now we have visited it
                //     if()
                // }
            }
        }

        if(!vis[dest])return new ArrayList<>();

        ArrayList<Integer>ans = new ArrayList<>();
        int d = dest;
        while(d !=-1){
            ans.add(d);
            d = parent[d];
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
