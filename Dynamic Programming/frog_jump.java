public class frog_jump {
    public static void main(String[] args){
        //now we tend to solve the problem frog jump using dynamic programming 
        //so the basic approach to solve any dynamic programming
        int n = 5; //number of stairs
        int[] dp = new int[n+1];
        //now basically we need to tell the minimum energy used by the frog

        ///inorder to solve a problem of dp
        /// 1. think about the base case
        /// 2. think about the choice diagram
        //base case 
        //3. initialization
        dp[0] = 0; //energy used to reach first stair is 0
        dp[1] = Math.abs(height[1] - height[0]);
        
    }
}
