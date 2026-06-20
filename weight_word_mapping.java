public class weight_word_mapping{
    
    public String mapWordWeights(String[] words, int[] weights) {
        String a1 = "";
        int max = Integer.MIN_VALUE;
        for(String s : words){
            int k1 = 0;
            for(char c : s.toCharArray()){
                k1+= weights[(int)c - 97];
            }
            // System.out.println((char)97);
            char ch = (char) (96 + (26 - (k1%26)));
            // System.out.println(ch + " " + k1 + " " + (26 - k1%26));
            a1+=ch;
      
        }
        return a1;
    }

}