public class Find First and Last Position of Element in Sorted Array{
        class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = FindLeftBound(nums,target);
        int right = FindRightBound(nums,target);
        return new int[]{left,right};
    }
        private int FindLeftBound(int nums[], int target){
            int start = 0;
            int end = nums.length -1;
            int index = -1;
            while(start<=end){
                int mid = start + (end - start)/2;
                if(nums[mid] > target){
                    end = mid -1;
                    

                }
                else if(nums[mid] < target){
                    start = mid + 1;

                }
                else{
                    index = mid;
                    end = mid-1;
                    
                }

            }
            return index;
        }
        private int FindRightBound(int nums[], int target){
            int start = 0;
            int end = nums.length -1 ;
            int index = -1;
           while(start<=end){
                int mid = start + (end - start)/2;
                if(nums[mid] == target){
                    index = mid;
                    start = mid+1;
                    

                }
                else if(nums[mid] < target){
                    start = mid + 1;

                }
                else{
                    
                    end = mid -1;
                    
                }

            }
            return index;
        }
    }


}