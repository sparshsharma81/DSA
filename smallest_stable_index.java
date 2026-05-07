public class smallest_stable_index {
    class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] nums2 = new int[nums.length];
        int[] nums3 = new int[nums.length];

        nums3[0] = nums[0];
        nums2[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            nums2[i] = Math.min(nums[i],nums2[i+1]);
        }
        
        for(int i =1;i<nums.length;i++){
            nums3[i] = Math.max(nums3[i-1] , nums[i-1]);
        }

        int min = Integer.MAX_VALUE;

        for(int i =0;i<nums.length;i++){
            int a1 = nums3[i] - nums2[i];
            // System.out.println(nums3[i] + " " + nums2[i]);
            if(a1 <= k)return i;
        }
        // for(int i : nums3)System.out.println(i);
        return -1;
    }
}
}
