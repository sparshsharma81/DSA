public class min_element_replace_sun{
    class Solution {
    public int min(int n){
        int sum =0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i : nums)min = Math.min(min, min(i));
        return min;
    }
}
}