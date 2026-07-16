public class gcd_of_odd_and_even_sums{
    class Solution {
    private int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    ///gcd of odd and even
    public int gcdOfOddEvenSums(int n) {
        int a = n * n;
        int b = n * (n+1);
        return gcd(a,b);
    }
}
}


