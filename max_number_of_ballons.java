public class max_number_of_balloons{
    
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer>h1 = new HashMap<>();
        for(char c : text.toCharArray()){
            if(c =='b' || c =='a' || c =='l' || c =='o' || c =='n'){
            h1.putIfAbsent(c,0);
            h1.put(c,h1.get(c)+1);
            }

        }
        if(h1.size() != 5)return 0;
        int max = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer>h : h1.entrySet()){
            int a = h.getValue();
            char ch = h.getKey();
            if(ch == 'o' || ch == 'l' )a = (a%2 ==0)?(a/2):(a-1)/2;
            max = Math.min(max,a);
            // System.out.println("Character: " + ch + " Value: " + a + " And MAX: " + max);
        }
        System.out.println(h1);
        return max;
    }

}