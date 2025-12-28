public class RottingOrange{
      public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]>q = new LinkedList<>();
        int fresh =0;

        //step1: we count all the fresh orange and but the rotten in queue
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1)fresh++;
                else if(grid[i][j] == 2)q.add(new int[]{i,j});
            }
        }

        if(fresh ==0)return 0;
        int time =0;//this will be our final answer
        int[] dx = {0,-1,0,1};
        int[] dy = {-1,0,1,0};
        //step2 : we will do the bfs

        while(!q.isEmpty()){
            int size= q.size();
            boolean rot = false;
            for(int i=0;i<size;i++){

            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int d =0;d<4;d++){
                //nx and ny are the coordinates of the cell
                int nx = x + dx[d];
                int ny = y + dy[d];
                //now this is basically searching in all the corners
                if(nx>=0 && ny>=0 && nx<n && ny<m && grid[nx][ny] == 1){
                    grid[nx][ny] = 2;
                    fresh--;
                    rot = true; //now we will increase the time
                    q.add(new int[]{nx,ny});
                }
            }
         }
         if(rot)time++;//means if any rotten orange left,,we will increase the time


        }
        return fresh==0?time:-1;
        // return fresh==0?time:-1;

    }
}