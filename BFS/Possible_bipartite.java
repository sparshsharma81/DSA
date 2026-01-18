import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Possible_bipartite {
    static class Pair{
        int num;
        int col;
        Pair(int num, int col){
            this.num = num;
            this.col = col;
        }
    }
    private boolean check(ArrayList<ArrayList<Integer>>adj){
        int n = adj.size();
        boolean[] vis = new boolean[n];
        int[] col = new int[n];
        // Queue<Pair>q1 = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                Queue<Pair>q1 = new LinkedList<>();
                vis[i] = true;
                col[i] = 0;
                //we start from 0;
                q1.offer(new Pair(i,0));
                while(!q1.isEmpty()){
                    Pair p1 = q1.poll();
                    int num = p1.num;
                    int col1 = p1.col;
                    for(int ne : adj.get(num)){
                        int put = (col1 + 1)%2;
                        if(!vis[ne]){
                            vis[ne] = true;
                            col[ne] = put;
                            q1.offer(new Pair(ne,put));
                            
                        }
                        else{
                            //it means hamne dekha hua hai ise
                            if(col[ne] != put)return false;
                        }
                    }
                }

            }
        }
        return true;
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
      for(int i=0;i<dislikes.length;i++){
      int a = dislikes[i][0]-1;
      int b= dislikes[i][1]-1;
      adj.get(a).add(b);
      adj.get(b).add(a);
            // adj.get(dislikes[i][j]).add(dislikes)
        
      }
      for(int i=0;i<adj.size();i++){
        // for(int j : adj.get(i))System.out.print(j + "  ");
        // System.out.println();
      }
      
      return check(adj);
        
    }

}
