import java.util.Arrays;

public class maximum_product_of_two_elements_in_array{
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);//this will sort the array in the assending order..
        int n = nums.length-1;
        return (nums[n]-1) * (nums[n-1]-1);
}
}