public class find_safe_walk_through_grid{
    class Solution {

    //left right up down
    int[] dx = {-1 , 1 , 0, 0};
    int[] dy = {0 , 0 , 1 , -1};
    private boolean value(int i, int j, int health, int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        if(i < 0 || j < 0 || i>=n || j >=m || grid[i][j] == -1)return false;

        if(grid[i][j] == 1)health--;

        if(health < 1)return false;
        
        if(i == n-1 && j == m-1)return true;

        int pre = grid[i][j];

        grid[i][j] =-1;

        boolean ans = value(i+1,j,health,grid) 
        || value(i-1,j,health,grid) 
        || value(i,j+1,health,grid)
        || value(i,j-1,health,grid);

        grid[i][j] = pre;
        return ans;
    }
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int[][] grid1 = new int[grid.size()][grid.get(0).size()];

    int i=0;
    for(List<Integer>h : grid){
       for(int j=0;j<h.size();j++){
        grid1[i][j] = h.get(j);
       }
       i++;
    }

        return value(0,0,health,grid1);

       
    }
}
}