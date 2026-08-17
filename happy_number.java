public class happy_number{
    private static int sq(int n){
        int sum =0;
        while(n!=0){
            sum+=(n%10) * (n %10);
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer>h1 = new HashSet<>();
        while(n!=1){
            if(h1.contains(n))return false;
            h1.add(n);
            n =sq(n);
            // h1.add((n));

        }
        return true;
    }
}