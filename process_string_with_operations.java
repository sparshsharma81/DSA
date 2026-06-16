public class process_string_with_operations{
    class Solution {
    private StringBuilder reverse(StringBuilder sb){
        return sb.reverse();
    }
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch))sb.append(ch);
            if(ch =='#')sb.append(sb);
            if(ch == '%')reverse(sb);
            if(ch =='*'){
                int a = sb.length();
                if(a!=0)sb.deleteCharAt(a-1);
            }

        }
        return sb.toString();
    }
}
}