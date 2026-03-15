class Solution {
    public staic void main(String args[]){
        int n = 5;
        System.out.println(new Solution().bitwiseComplement(n));
    }
    public int bitwiseComplement(int n) {
        String s = Integer.toBinaryString(n);
        String s2 = "";
        for(char c : s.toCharArray()){
            if(c == '0')s2+='1';
            else s2+='0';
        }
        int a = Integer.parseInt(s2,2);
        // int b = Integer.parseInt()
        return a;

        // System.out.println(s2);
        // return 1;
    }
}