public class maximum_product_of_three_numbers {
    public int maximumProduct(int[] nums) {
       //edge case hai..agr kisi element ke andar 3 ya usse kam element hoge
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }

       //isse ham 3 largest numbers find kar rahe hai
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
     //we are finding the two smallest numbers... which are most negative
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int num : nums) {
            // Track three largest numbers
            if (num > max1) { 
                max3 = max2; 
                max2 = max1; 
                max1 = num; 
            } else if (num > max2) { 
                max3 = max2; 
                max2 = num; 
            } else if (num > max3) { 
                max3 = num; 
            }

            // Track two smallest numbers
            if (num < min1) { 
                min2 = min1; 
                min1 = num; 
            } else if (num < min2) { 
                min2 = num; 
            }
        }

        // this code will find the maximum of three largest or..
        //2 smallest * maximum
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}
