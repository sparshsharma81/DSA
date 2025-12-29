import java.util.*;

public class Shortest_Path_In_Directed_Acyclic_Graph {
    public static void dfs(boolean[] vis,ArrayList<ArrayList<int[]>>adj,int src,Stack<Integer>st){
        vis[src] = true;
        for(int[] i : adj.get(src)){
            if(!vis[i[0]])dfs(vis,adj,i[0],st);
        }
        st.push(src);
    }

      public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        //first we need to find the topological sort of the given graph

        //we will create the adjancency list
        ArrayList<ArrayList<int[]>>adj = new ArrayList<>();
        for(int i =0;i<V;i++)adj.add(new ArrayList<>());
        for(int[] i : edges){
            int u = i[0];
            adj.get(u).add(new int[]{i[1],i[2]});
            //the i[2] is the weight and the i[1] is the direction
            // adj.get(i[0]).add(i[1]);
        }

        //now we are doing topological sort
        boolean[] vis = new boolean[V];
        Stack<Integer>st = new Stack<>();

        for(int i=0;i<V;i++){
            if(!vis[i])dfs(vis,adj,i,st);
        }
        int src =0;
        // now the topological sort is stored in stack
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] =0;

        //now we will relax the edges///means to calculate the optimal distance
     while(!st.isEmpty()){
        int before = st.pop();
        if(dist[before] != Integer.MAX_VALUE){
            for(int[] b : adj.get(before)){
                int after = b[0];
                int wt = b[1];
                if(dist[before]+ wt < dist[after]){
                    dist[after] = dist[before] + wt;
                }
            }
        }
     
      }

      for(int i=0;i<V;i++){
        if(dist[i] == Integer.MAX_VALUE){
            dist[i] = -1;
        }
      }

        // int[] ans = new int[V];

        return dist;
        
    }
}
