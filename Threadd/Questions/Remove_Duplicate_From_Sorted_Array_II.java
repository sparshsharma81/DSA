public class Remove_Duplicate_From_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
       int count =0;
       int init=nums[0];
       int k =2;
       for(int i=2;i<nums.length;i++){
        if(nums[i] != nums[k-2]){
            nums[k] = nums[i];
            k++;
        }
       }
       return k;
    }
}