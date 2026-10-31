public class Binary_digit_score{
    public int calculateScore(int a, int b) {
        String s = Integer.toBinaryString(a);
        int f =0;
        int f2 =0;
        String s1 = Integer.toBinaryString(b);
        System.out.println(s1);
        for(char c : s.toCharArray()){
            if(c == '1')f++;

        }
        System.out.println(s);
        System.out.println(f);
        for(char c : s1.toCharArray()){
            if(c == '1')f2++;
        }
        if(f > f2)return f * f2;
        if( f < f2)return f2 /f;
        return f * f2;
    }

}