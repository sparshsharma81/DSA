public class smallest_index_with_digit_sum_equal_to_index{
    private int indexsum(int a){
        if(a<10)return a;
        int sum =0;
        while(a>0){
            // a/=10;      
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(indexsum(nums[i]) == i) return i;
        }
        return -1;
    }
}