public class Integer_Replacement{
    public int integerReplacement(int num) {
        int count =0;
        long n= num;
        while(n!=1){
           if(n%2 ==0) n/=2;
           else{
                    if(n ==3 || n%4 ==1)n--;
                       
                    else n++;
                }
           count++;
        } 
        return count;
}
}