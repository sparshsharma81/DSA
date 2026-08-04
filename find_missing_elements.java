public class missing_elements{
    public List<Integer> findMissingElements(int[] nums) {
       Arrays.sort(nums);
       int min = nums[0];
       int max = nums[nums.length-1];
       int[] arr = new int[max+1];
       for(int i=0;i<nums.length;i++){
        arr[nums[i]]++;
       }
       List<Integer>h1 = new ArrayList<>();
      for(int i=1;i<arr.length;i++){
       if(i>=min && i <=max)if(arr[i] == 0)h1.add(i);
      }
       return h1;
        // return -1;
    }
}