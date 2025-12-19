import java.util.Arrays;

public class BelmernFord {

    public static void main(String[] args) {
        int V = 4; // number of vertices
        int[][] edges = {  // {src, dest, weight}
            {0, 1, 4},
            {0, 2, 5},
            {1, 2, -3},
            {1, 3, 2},
            {2, 3, 4}
        };
        int source = 0;

        // Step 1: Initialize distances
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        // Step 2: Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (int[] e : edges) {
                int u = e[0], v = e[1], w = e[2];
                if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        // Step 3: Negative cycle check
        boolean negativeCycle = false;  
        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                negativeCycle = true;
                break;
            }
        }

        // Step 4: Print result
        if (negativeCycle) {
            System.out.println("Graph contains negative weight cycle!");
        } else {
            System.out.println("Vertex Distance from Source:");
            for (int i = 0; i < V; i++) {
                System.out.println("Vertex " + i + ": " + dist[i]);
            }
        }
    }
}
