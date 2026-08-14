public class maximum_greatness_of_array{
    public int maximizeGreatness(int[] nums) {
       
        Arrays.sort(nums);
        // for(int i : nums)System.out.print(i + " ");
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > nums[ans])ans++;
        }
        return ans;
    }
}