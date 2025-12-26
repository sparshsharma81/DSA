public class rank {
    class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer>h1 = new HashSet<>();
        for(int i : arr)h1.add(i);
        
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : h1)pq.add(i);
        // HashMap<Integer,Integer>h1 = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     h1.put(arr[i],i);
        //     pq.add(arr[i]);
        // }
        HashMap<Integer,Integer>an2 = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            an2.put(arr[i],i);
        }
        int k =h1.size();
        while(!pq.isEmpty()){
            an2.put(pq.poll(),k--);
            // System.out.print(pq.poll() + " ");
        }

        for(int i=0;i<arr.length;i++){
            int n = an2.get(arr[i]);
            arr[i] = n;

        }
        return arr;
    //     System.out.println(an2);
    //     Arrays.sort(arr);
    //     System.out.println(h1);
    //     System.out.println(pq);
    //     // for(int i=0;i<)
    //     return new int[]{1};
    // }
    }
}
}
