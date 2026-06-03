public class single_number{
    class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>h1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
        for(int i : h1.keySet()){
            if(h1.get(i) ==1)return i;
        }
        return 0;
    }
}
}