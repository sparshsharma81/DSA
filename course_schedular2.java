public class course_schedular2{
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //we can solve this question with kahn's algorithm
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i =0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];
        for(int[] i : prerequisites){
            int course = i[0];
            int target = i[1];
            adj.get(i[1]).add(i[0]);
            indegree[i[0]]++;
        }

        Queue<Integer>q1 = new LinkedList<>();
        int an1 =0;
        int[] ans = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(indegree[i] ==0)q1.add(i);

        }
        while(!q1.isEmpty()){
            int curr = q1.poll();
            ans[an1] = curr;
            an1++;
            for(int ne : adj.get(curr)){
                indegree[ne]--;
                if(indegree[ne] ==0)q1.add(ne);
            }

        }
        return (an1!=numCourses)? new int[0] : ans;
    }
}