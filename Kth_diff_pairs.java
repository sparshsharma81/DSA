import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Kth_diff_pairs {
    public int findPairs(int[] nums, int k) {
        int c=0;
        HashSet<ArrayList<Integer>>h1 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j= i+1;j<nums.length;j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    ArrayList<Integer>h2 = new ArrayList<>();
                    h2.add(nums[i]);
                    h2.add(nums[j]);
                    Collections.sort(h2);
                    h1.add(h2);
                }
            }
        }
        return h1.size();
    }
}
