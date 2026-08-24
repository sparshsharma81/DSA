class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //let us first solve this in brute force approach
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j] == target)return true;
        //     }
        // }
        // return false;
        //this is the brute force approach of the code which solves the code in 
        //O(n^2) complexicity....

        //we are given the task to sovle the question in O(log(m*n)) complexicity

        int m = matrix.length;
        int n = matrix[0].length;
        int left =0, right = m*n -1;

        //now there is a better approach of finding middleelement in array..
        //row --- mid[mid/n]
        //column ---- mid[mid % n];

        while(left<=right){
            int mid = left + (right - left)/2;
            int value = matrix[mid/n][mid%n];
            if(value == target){
                return true;
            }
            else if(value<target){
                left =mid+1;
            }
            else{
                right = mid-1;
            }

        }
        return false;
    }
}