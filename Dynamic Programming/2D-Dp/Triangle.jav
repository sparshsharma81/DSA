public class Triangle{
    public static void main(String[] args){
        private int minimumTotal(int[][] triangle){
            //brute force approach
            //generating all combinations 
            int n = triangle.length;
            
            return helper(triangle,0,0,n);  

        }
        //now we are going to solve the triangle problem using dp 
        //let us try the brute force approach
        int[][] triangle = {
            {2},
            {3,4},
            {6,5,7},
            {4,1,8,3}
        };
        System.out.println(minimumTotal(triangle));
    }
}