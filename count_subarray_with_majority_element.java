public class count_subarray_with_majority_element{

    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int a =0;
        for(int i=0;i<n;i++){
            int tar =0;
            for(int j=i;j<n;j++){
                if(nums[j] == target)tar++;
                
                int len = j - i + 1;
                if(tar > len/2)a++;
            }
        }
        return a;
    ///and subarray
}
}