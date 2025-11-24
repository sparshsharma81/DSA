import java.util.*;

public class graph1 {

    static class Edge {
        int src;
        int dst;
        int wt;
        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dst = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Use only nodes within bounds (0 to 3)

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 2));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 10));
        graph[2].add(new Edge(2, 1, 2));
        graph[2].add(new Edge(2, 3, 5));

        graph[3].add(new Edge(3, 1, 7));
        graph[3].add(new Edge(3, 2, 7));
    }

    public static void bfs(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[V];

        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.println(curr); // print node number
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dst);
                }
            }
        }
    }

    //if the graph is not connected..then also it is a graph

    public static void main(String args[]) {
        int v = 4; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        bfs(graph, v);
    }
}
