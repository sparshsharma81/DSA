public class partition_array_according_to_pivot {
    class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int i=0;
        for(int j : nums){
            if(j < pivot)arr[i++] = j;
            // System.out.println(arr[i-1] + " " + j +" " + i);

        }
        // i++;
        // arr[i++] = pivot;
        for(int j : nums){
            if(j == pivot)arr[i++] = j;
        }
        // System.out.println(arr[i]  + " " + pivot + " " + i);
        for(int j : nums){
            if(j> pivot)arr[i++] = j;
            //  System.out.println(arr[i-1] + " " + j +" " + i);
        }
        return arr;
    }
}
}
