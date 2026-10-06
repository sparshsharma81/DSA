public class Minor_Reflection{
    public int mirrorReflection(int p, int q) {
        //this question is based on geometry which is rarely asked in interview
        //the concept which we will use is even and odd
        //great..now before testing the condition where p and q both are even
        //we need to first remove the factors and then check
        while(p%2 ==0 && q%2 ==0){
            p/=2;
            q/=2;
        }
        //if they both are even..then the ans is 1 as it is a diagonal
        

        //if p is even and q is odd -- ans =2 
        if(p%2 == 0 && q %2!=0)return 2;
         
        if(p%2 !=0 && q%2!=0)return 1;
        if(p%2!=0 && q%2 ==0)return 0;
        
        return 1;
    }
}