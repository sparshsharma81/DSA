public class split_string_balanced_string {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
              balance++;

            }
            else{
                balance--;
            }

            if(balance==0)count++;
        }
        return count;
}
}
