public class Divide_two_integer{
    public int divide(int dividend, int divisor) {
        int result = dividend/divisor;
        if(dividend == Integer.MIN_VALUE && divisor ==-1){
            return Integer.MAX_VALUE;
        }
             return result;

    }
}