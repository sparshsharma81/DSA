public class left_right_sun_diff {
  class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1] + nums[i];
        }
        right[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i] = right[i+1] + nums[i];
        }
        // for(int i : left)System.out.print(i + " ");
        // System.out.println();
        // for(int i : right)System.out.print(i + " ");
                // System.out.println();

        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a1 = (i==0)?0 : left[i-1];
            int a2 = (i == nums.length-1)?0:right[i+1];
            ans[i] = Math.abs(a1 - a2);
            // System.out.println(a1 + " " + a2 );
        }
        return ans;
    }
}
}