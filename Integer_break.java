public class Integer_break{
    public int integerBreak(int n) {
        if(n ==2 ) return 1;
        if(n ==3) return 2;
        int product =1;
        while(n>4){
            product *=3;
            n-=3;
        }
        return product * n;

        //so our basic approach for solving this izz 
        //ki maximum product is that the number must be a multiple of 3;;;
        //ye question bina dynamic programming ke bhi ho sakta hai....
        
}
}