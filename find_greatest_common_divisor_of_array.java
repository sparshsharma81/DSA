public class find_greatest_common_divisor_of_array{
    public int findGCD(int[] nums) {
        //first we just find the smallest number 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max < nums[i])max = nums[i];
            if(min > nums[i])min = nums[i];
        }
        int ans =1;
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                ans = i;
            }
        }
        return ans;

    }

}