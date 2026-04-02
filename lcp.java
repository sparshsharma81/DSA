public class lcp {
    class Solution {
    private int min_length(String[] str){
        int count =0;
        int min =str[0].length();
        for(String strs : str){
            count = strs.length();
            min = Math.min(min,count);
        }
        return min;
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int min = min_length(strs);
        // int i=0;
        StringBuilder st= new StringBuilder();
        for(int i=0;i<min;i++){
            
           char ch = strs[0].charAt(i);
             for(String str:strs){
                if(str.charAt(i)!=ch){
                    return st.toString();
                }
            }
            st.append(ch);
        }
        return st.toString();
     
    }
}
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}