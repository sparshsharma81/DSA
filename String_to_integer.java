public class string_to_integer{
    public int myAtoi(String s) {
        
        int count =0;
        s = s.trim();
        if(s.isEmpty()) return 0;
        boolean negative = false;
        int i =0;
        if(s.charAt(i) == '-' || s.charAt(i) =='+'){
                negative = (s.charAt(i)=='-');
                i++;
            }
        
        for(;i<s.length();i++){
            
             if(!Character.isDigit(s.charAt(i))){
              break;
            }
            else{
                if(count>(Integer.MAX_VALUE - (s.charAt(i) - '0'))/10){
                    return (negative == true)?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
                count = count*10 + (s.charAt(i) - '0');
            }
        }
       if(negative){
       
         return -count;
       }
       else{
        return count;
       }
       
    }

}