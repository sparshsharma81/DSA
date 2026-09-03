public class unique_path{
    public int uniquePaths(int m, int n) {

        //how to write recurssion
        /*
        1.express everything in terms of index or i and j for a 2d matrix
        2.explore / do all the stuff
        3. Sum up all the ways/ min or max

        //like if i ==0 and j ==0 this means that the recurrsion has reach the path...
        //if i <0 || j <0 this means that array goes out of index
        //now 1st path --- go up
        

        */
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j= 0;j<n;j++){
                arr[i][j] = -1;
            }
        }
        int a = solve(arr,m-1,n-1);
        return a;
        
    }
    private int solve(int[][]dp,int i , int j){
        if(i == 0 && j == 0)return 1; //ham puch gye
        if(i<0 || j<0)return 0;//this is invalid case
        if(dp[i][j] != -1)return dp[i][j];
        int left = solve(dp,i,j-1);
        int up = solve(dp,i-1,j);
        return dp[i][j] = up + left;
    }
}