public class kth_largest_element_in_array{
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>h1 = new PriorityQueue<>((a,b)->b - a);
        for(int i : nums)h1.add(i);
        // return h1.get(k);
        int ans = -1;
        while(k-->1)h1.poll();
        return h1.poll();
    }
}