public class BinaryStringsAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        String a = Integer.toBinaryString(n);
        char ch1 = a.charAt(0);
        for(int i=1;i<a.length();i++){
            if(ch1==a.charAt(i)){
                return false;
            }
            ch1 = a.charAt(i);
        }
        return true;
    }

}
