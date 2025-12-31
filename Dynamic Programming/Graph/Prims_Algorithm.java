
import java.util.*;
public class Prims_Algorithm {
    public static int sum(int V , int[][] edges){

        ArrayList<ArrayList<int[]>>adj = new ArrayList<>();

        //step1: creating the adjacency arraylist
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());

        //step2: building the undireccted graph
        for(int[] e : edges){
            int a = e[0];
            int b= e[1];
            int c = e[2];
            adj.get(a).add(new int[]{b,c});
            adj.get(b).add(new int[]{a,c});
        }

        //step3 : building a array to check if the node is included in or not
        boolean[] isMst = new boolean[V];
        int[] par = new int[V];
        Arrays.fill(par,-1);

        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[0] - b[0]);

        pq.add(new int[]{0,0});//we will start from the 0th node
        // int[] node = 
        int wt = 0;

        while(!pq.isEmpty()){
            int[] fir = pq.poll();
            int b1 = fir[0]; //this is the node to add 
            int a1 = fir[1]; //this is the weight of node 
            // int c1 = fir[2];
            if(isMst[a1])continue;
            isMst[a1] = true;
            wt+=b1;

            for(int[] ne : adj.get(a1)){
               int ne1 = ne[0];
            int ne2 = ne[1];

            if(!isMst[ne1] && w <)



            }

        }
        
        // int wt;

        return wt;

    }
    public static void main(String args[]){
        
    }
}
