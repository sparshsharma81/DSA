import java.util.ArrayList;

public class separate_digit {
  class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();
       
       for(int i=nums.length-1;i>=0;i--){
        int k = nums[i];
        while(k!=0){
            arr.add(k%10);
            k/=10;
        }
       }
        int[] arr2 = new int[arr.size()];
        int k1 =0;
        for(int i=arr.size()-1;i>=0;i--){
            arr2[k1++] = arr.get(i);
        }
        return arr2;
    }
}
}