public class dp1 {
    class Solution {
    public int minimumDifference(int[] nums) {
        //we need to find partision a subset into two arrays..
        //to find the minimum sum ...the minimum is 0
        //we need to form the target sum approach
        //we will now just find the target sum approach...
        int target =0;
        for(int i : nums)target+=i;
        boolean[][] dp = new boolean[nums.length][target+1];
        //we choose boolean not Boolean because in Boolean all values are null
        //and in boolean all values are false;
        // boolean ans = solve2(nums,target,dp);
        //now in the last row..is our requred answer
        int ans = solve2(nums, target, dp);
        return ans;

    }
    private static int solve2(int[] nums , int target, boolean[][] dp){
        //now in this we need to make first element
        int n = nums.length;
        for(int i =0;i<n;i++){
            dp[i][0] = true;
        }
        if(nums[0] <= target)dp[0][nums[0]] = true;

        for(int i =1;i<n;i++){
            for(int j = 1;j<=target;j++){
                // boolean take = dp[i-1][j];
                boolean not = dp[i-1][j];
                boolean take = false;
                if(j - nums[i] >=0)take = dp[i-1][j - nums[i]];
                dp[i][j] = not || take;
            }
        }
        // return dp[n];

        int min = Integer.MAX_VALUE; //extremem minimum value can lead to interger overflow 
        for(int i=0;i<=target/2;i++){
            if(dp[n-1][i] == true){
                min = Math.min(min,Math.abs((target-i)-i));
            }
        }
        return min;
    }
}
}
