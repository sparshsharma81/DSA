public class check_good_integer{
    
    private static boolean cal(int n){
        int sum1 =0;
        int pro1 =1;
        while(n !=0){
            int k = n % 10;
            sum1+=k;
            pro1+= k*k;
            n/=10;
        }
        return pro1 - sum1 >=50;
    }
    public boolean checkGoodInteger(int n) {
     return cal(n);
    
}
}