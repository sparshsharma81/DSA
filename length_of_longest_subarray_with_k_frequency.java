public class length_of_longest_subarray_with_k_frequency{
    public int maxSubarrayLength(int[] nums, int k) {
       HashMap<Integer,Integer>h1 = new HashMap<>();
       int l =0;
       int r =0;
       int ans =0;
       for(int i=0;i<nums.length;i++){
        h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        while(h1.get(nums[i]) > k){
            h1.put(nums[l],h1.get(nums[l])-1);
            l++;
        }
        ans = Math.max(ans,i - l + 1);

       }
       return ans;
    }
}