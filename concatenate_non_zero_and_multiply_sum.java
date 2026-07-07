public class concatenate_non_zero_and_multiply_sum{
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        long y = 0;
        long sum =0;
        for(int i=0;i<s.length();i++){
            int ch = Character.getNumericValue(s.charAt(i));
            if(ch !=0){
                y = y*10 + ch;
                sum+=ch;
            }
        }
        return y * sum;
        
    
}
}