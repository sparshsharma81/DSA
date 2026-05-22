public class rotate_array{
    class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target)return mid;
            
            //now first let us check whether it is left side sorted or not
            else if(nums[mid] >= nums[start]){
                //this means it is left side sorted 
                if(nums[start] <= target && nums[mid] > target)end = mid -1;
                else start = mid +1;

            }

            else{
                //this is sorted righern side 
                if(nums[mid] <= target && nums[end] >= target)start = mid+1;
                else end = mid -1;

            }
        }
        return -1;
    }
}
}