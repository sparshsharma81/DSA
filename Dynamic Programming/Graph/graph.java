//package Graph;
import java.util.*;
public class graph {
    static class Edge{
        int src;
        int dst;
        int wt;
        public Edge(int s, int d, int wt){
            this.src = s;
            this.dst  = d;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,2));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,10));
        graph[2].add(new Edge(2,1,2));
        graph[2].add(new Edge(2,3,5));

        graph[3].add(new Edge(3,1,7));
        graph[3].add(new Edge(3,2,7));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,9));
        graph[4].add(new Edge(4,9,8));

        
    }
    public static void bfs(ArrayList<Edge> graph[],int V){
    Queue<Integer> q = new LinkedList();
    boolean vis[] = new boolean[V];
    q.add(0);
    while(!q.isEmpty()){
        int curr = q.remove();
        if(vis[curr] == false){
            System.out.println(vis[curr]);
            vis[curr] = true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                q.add(e.dst);

            }

        }

    }


    }
    public static void main(String args[]){
        int v = 5; //the vertex of graph which we will make is 4
        int n = 10^5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        //print 2's neighbours
        // for(int i=0;i<graph[i].size();i++){
        //     Edge e = graph[i].get(i);
        //     System.out.println(e.dst + " , " + e.wt);
        // }
        bfs(graph,4);
         
//the representation of graph in memory in 2d matrix in adjacentry matrix -- it takes very long time in finding elements and does not have efficient storage
    }
}
