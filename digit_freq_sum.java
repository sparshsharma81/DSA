public class digit_freq_sum {
   class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer>h1 = new HashMap<>();
        while(n!=0){
            int a = n % 10;
            h1.putIfAbsent(a,0);
            h1.put(a,h1.get(a) + 1);
            n/=10;
        } 
        int sum =0;
        for(Map.Entry<Integer,Integer>h : h1.entrySet()){
            int a = h.getKey();
            int b = h.getValue();
            sum+= a * b;
        }
        return sum;
    }
}
}