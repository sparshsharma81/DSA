import java.util.*;
public class Bellmernford1 {
          public static int[] bellmanFord(int V, int[][] edges, int src) {
            int[] dist = new int[V];
            Arrays.fill(dist,Integer.MAX_VALUE);
            dist[src] = 0;
            

            //now we need to relax all the edges v-1 times
            for(int i=1;i<V-1;i++){
                // if(dist[i]!=Integer.MAX_VALUE){
                for(int[] e : edges){
                    int a = e[0];
                    int b = e[1];
                    int c = e[2];
                    
                    if(dist[a] != Integer.MAX_VALUE){
                    if(dist[a] + c < dist[b]){
                        dist[b] = dist[a] + c;
                    }
                }
                }
            }

            //now we relax one more time
              for(int[] e : edges){
                    int a = e[0];
                    int b = e[1];
                    int c = e[2];
                    
                    if(dist[a] != Integer.MAX_VALUE){
                    if(dist[a] + c < dist[b]){
                        // dist[b] = dist[a] + c;
                        System.out.println("Cycle detected");E
                    }
                }
                }


            int[] ans = new int[V];

            return ans;
          }
    public static void main(String[] args){

    }
}
