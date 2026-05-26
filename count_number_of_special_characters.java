public class count_number_of_special_characters{
    
    public int numberOfSpecialChars(String word) {
        HashSet<Character>st = new HashSet<>();
        for(char c: word.toCharArray()){
            if(Character.isLowerCase(c)){
                st.add(c);

            }
        }
        int ans =0;
        for(char ch: word.toCharArray()){
            if(Character.isUpperCase(ch)){
                if(st.contains(Character.toLowerCase(ch))){
            ans++;
            st.remove(Character.toLowerCase(ch));
                }
            }
        }

        return ans;
      
        
    }
}
