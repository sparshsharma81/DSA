import java.util.*;

public class Dijkastro {

    // Pair class to store edge information
    static class Pair {
        int weight; // edge weight
        int node;   // destination node
        Pair(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }
    }

    // Dijkstra's algorithm
    public static int[] dij(int V, ArrayList<ArrayList<Pair>> adj, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.weight, b.weight)
        );

        int[] parent = new int[V];
        Arrays.fill(parent,-1);

        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int u = curr.node;
            int d = curr.weight;

            if (d > dist[u]) continue;

            for (Pair p : adj.get(u)) {
                int v = p.node;
                int w = p.weight;

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    parent[v] = u;
                    pq.add(new Pair(dist[v], v));

                }
            }

           
        }
         for(int i :parent)System.out.print(i + " ");
        return dist;
    }

    // Print adjacency list
    static void printGraph(ArrayList<ArrayList<Pair>> adj) {
        System.out.println("\nGraph adjacency list:");
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Pair p : adj.get(i)) {
                System.out.print("(" + p.node + ", w=" + p.weight + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Create undirected weighted graph
        adj.get(0).add(new Pair(2, 1));
        adj.get(1).add(new Pair(2, 0));

        adj.get(1).add(new Pair(4, 2));
        adj.get(2).add(new Pair(4, 1));

        adj.get(0).add(new Pair(1, 3));
        adj.get(3).add(new Pair(1, 0));

        adj.get(3).add(new Pair(3, 2));
        adj.get(2).add(new Pair(3, 3));

        adj.get(2).add(new Pair(1, 4));
        adj.get(4).add(new Pair(1, 2));

        // Run Dijkstra from node 0
        int[] dist = dij(V, adj, 0);

        // Print shortest distances
        System.out.println("Shortest distances from node 0:");
        for (int i = 0; i < V; i++) {
            System.out.println("0 -> " + i + " = " + dist[i]);
        }

        // Print graph
        printGraph(adj);
    }
}
