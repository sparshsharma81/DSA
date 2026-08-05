public class camelcasematching{
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean>ans = new ArrayList<>();
        for(String s: queries){
            ans.add(check(s,pattern));
        }
        return ans;
    }
    public boolean check(String s, String q){
        int i=0;
        int j=0;
        while(i<s.length() && j < q.length()){
           if(s.charAt(i) == q.charAt(j)){
            i++;
            j++;
           }
           else{
            if(Character.isUpperCase(s.charAt(i)))return false;
            i++;
           }
        }
        if(j == q.length()){
            while(i<s.length()){
                if(Character.isUpperCase(s.charAt(i)))return false;
                i++;
            }
            return true;
        
        return false;
    }
}
}