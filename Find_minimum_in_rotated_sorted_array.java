public class Find_minimum_in_rotated_sorted_array{
    public int findMin(int[] arr) {
        int start =0;
        int end = arr.length -1;
        int ans = arr[0];
        while(start <=end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= arr[0]){
                //array is sorted in left side 
                start = mid +1;
            }
            else {
                ans = arr[mid];
                end = mid -1;
            }
        }
        return ans;
    }

}