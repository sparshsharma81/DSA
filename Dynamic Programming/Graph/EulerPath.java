public class EulerPath {
    import java.util.*;

class EulerGraph {

    static ArrayList<Integer> eulerPath(int V, ArrayList<ArrayList<Integer>> adj) {

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> path = new ArrayList<>();

        // Find start node
        int start = 0;
        for (int i = 0; i < V; i++) {
            if (adj.get(i).size() % 2 != 0) {
                start = i;   // odd degree → Euler Path start
                break;
            }
        }

        st.push(start);

        while (!st.isEmpty()) {
            int u = st.peek();

            if (adj.get(u).size() > 0) {
                int v = adj.get(u).get(0);

                // remove edge u-v
                adj.get(u).remove((Integer) v);
                adj.get(v).remove((Integer) u);

                st.push(v);
            } else {
                path.add(st.pop());
            }
        }

        Collections.reverse(path);
        return path;
    }
}

}
