public class RegionsPairs {
     static class Pair{
        int node;
        long distance;
        Pair(int node, long distance){
            this.node = node;
            this.distance = distance;
        }
    }
    private static long ans(ArrayList<ArrayList<Integer>>adj){
        int n = adj.size();//these are the number of nodes
        boolean[] vis = new boolean[n];
        long regions =0;//these are to track the number of regions
        ArrayList<Pair>track = new ArrayList<>();
        
        for(int i=0;i<n;i++){

            if(!vis[i]){
                regions++;
               
                Queue<Pair>q = new LinkedList<>();
                q.offer(new Pair(i,0));
                vis[i] = true;
                long totalnodes = 1;
                while(!q.isEmpty()){
                    Pair curr = q.poll();
                    int node = curr.node;

                    long distance = curr.distance;
                  

                    for(int ne : adj.get(node)){
                        if(!vis[ne]){
                            vis[ne] = true;
                            totalnodes++;
                            q.offer(new Pair(ne,distance+1));
                           
                        }
                    }

                }

                track.add(new Pair((int)regions,totalnodes));
            }


        }

        //now in the final arraylist..we will have the regions and its track
        long total = n; //these are the number of edges
        long returnans= 0;
        while(track.size()!=0){
            Pair a = track.get(0);
            long totalnodes = a.distance;
            // System.out.println("TotalNodes : " + totalnodes);

            long connected = (total - totalnodes) * totalnodes;
            // System.out.println("Total Pairs : " + connected);
            // System.out.println("Before total : " + total);
            total-=totalnodes;
            // System.out.println("After total : " + total);

            returnans+=connected;
            // System.out.println("Answer: " + returnans);
        //   System.out.println();

            track.remove(0);
        }
        return returnans;

    }
    public long countPairs(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<>());
        for(int[] i : edges){
            int a = i[0];
            int b = i[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        long ans = ans(adj);
        return ans;
    }
}
