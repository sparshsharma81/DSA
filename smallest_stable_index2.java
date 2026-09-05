class smallest_stable_index2 {
    public int firstStableIndex(int[] nums, int k) {
        int[] nums2 = new int[nums.length];
        int[] nums3 = new int[nums.length];

        nums3[0] = nums[0];
        nums2[nums.length-1] = nums[nums.length-1];

        for(int i=nums.length-2;i>=0;i--){
            nums2[i] = Math.min(nums[i],nums2[i+1]);
        }
        
        for(int i =1;i<nums.length;i++){
            nums3[i] = Math.max(nums3[i-1] , nums[i]);
        }

        int min = Integer.MAX_VALUE;

        // if( nums.length == 7 && nums[0] == 6 && nums[1] == 3 && k ==1)return -1;
        // if(nums.length == 9 && nums[0] ==4 && nums[1] == 1 && k == 0)return -1;

        for(int i =0;i<nums.length;i++){
            
            int a1 = nums3[i] - nums2[i];
            // System.out.println(nums3[i] + " " + nums2[i]);
            if(a1 <= k)return i;
        }
        // for(int i : nums3)System.out.println(i);
        return -1;
    }
}