public class smallest_missing_integer_grateer_than_sequential_sum {
        public int missingInteger(int[] nums) {
            
            int max_sum = Integer.MIN_VALUE;
            int max_count = Integer.MIN_VALUE;
            int[] arr = new int[2252];
            int sum =nums[0];

            int count =1;

            for(int i=0;i<nums.length-1;i++){
                arr[nums[i]]++;

                // System.out.println(arr[nums[i]] + "    "+nums[i] + "Before Sum: " + sum + " Before Count: " + count);
            

                if(nums[i] + 1 == nums[i+1]){
                    count++;
                    sum+=nums[i+1];
                    
                    
                    if(count >= max_count){
                    max_sum = Math.max(max_sum , sum);
                    max_count = Math.max(max_count, count);
                    }
                }
                else {
                    count =1;
                    sum = nums[i+1];
                }
            
                        //    System.out.println(arr[nums[i]]+"   " + nums[i] + "Before Sum: " + sum + " Before Count: " + count);


                
            }

            int i =max_sum;
                arr[nums[nums.length - 1]]++;
            if (count >= max_count) {
                max_sum = sum;
                max_count = count;
            }


            while (i < arr.length && arr[i] > 0) {
                i++;
            }

            return i;

            
        }
}
