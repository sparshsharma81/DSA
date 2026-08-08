public class minimum_cuts_to_divide_circle{
     public int numberOfCuts(int n) {
        if(n ==1)return 0;
        return (n % 2 > 0)?n : n/2;
    }
}