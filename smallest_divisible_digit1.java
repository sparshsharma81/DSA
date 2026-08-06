public class smallest_divisible_digit1 {
    class Solution {
    public int isvalid(int n){
        int product =1;
        while(n>0){
            product = product * (n%10);
            n/=10;

        }
        return product;
    }
    public int smallestNumber(int n, int t) {
        if(n == 100) return 100;
        
        while(true){
            if(isvalid(n) % t == 0) return n;
            n++;
        }
        


    }
}
}
