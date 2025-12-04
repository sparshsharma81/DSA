// package Dynamic Programming.Subset_sum;

public class subset_sum_equal_to_target {
    public static boolean isSubsetSum(int[] nums, int target){
        //now we will be working on the dp approach
        //to be more specific..we will be working the tabulation approach to solve this problem

        int n = nums.length;
        boolean[][] dp = new boolean[n+1][target+1];
        //now we will be checking all combinations from 1 to n and from 1 to target whether
        //the sum can be formed or not 

        //step1:  first we will be filling the first column with true values 
        //as 0 can be formed with empty subsets also 

        for(int i=0;i<n;i++){
            dp[i][0] = true;
            //this means that 0 can be formed with any subsets....like empty subsets 

        }

        //step2 : now we have filled the first column with true values
        //becuase 0 can be formed with empty subsets
        //now we will be filling the first row with false values

        for()
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6, 8, 10};
        int target = 10;
        System.out.println(isSubsetSum(nums, target));
    }
}
