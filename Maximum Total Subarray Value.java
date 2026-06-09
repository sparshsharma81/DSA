public class Maximum Total Subarray Value {
    class Solution {
    public long maxTotalValue(int[] nums, int k) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
        for(int i : nums){
            min = Math.min(i,min);
            max = Math.max(i,max);
        }
        long ans = (long)((long)(max - min) * (long)k);
        return ans;
        
    }
}
}
