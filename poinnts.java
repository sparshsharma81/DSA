public class poinnts {
   
    public int maxScore(int[] c, int k) {
        int left =0;
        int right =0;
        int l =0;
        int r =c.length-1;
        while(l <k){
            left += c[l];
            l++;
        }
        
        l--;
       // System.out.println(l);
        int max = left;
        int max2 =left;
        
        while(l >=0){
            left-=c[l];
            right += c[r];
            max = Math.max(max, left + right);
            l--;
            r--;
        }
        return max;

    
}
}
