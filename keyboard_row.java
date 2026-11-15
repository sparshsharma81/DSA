import java.util.ArrayList;

public class keyboard_row {
    private static boolean check(String s){
         String s1 = "qwertyuiop";
        String s2= "asdfghjkl";
        String s3 = "zxcvbnm";
        int o = 0;
        int t = 0;
        int th = 0;
        for(char c : s.toCharArray()){

            String sc = Character.toLowerCase(c) + "";
            //System.out.println(sc);
            if(s1.contains(sc)){
                o = 1;
            }
            if(s2.contains(sc))t = 1;
            if(s3.contains(sc))th = 1;
            if(o+t+th != 1)return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
       
        ArrayList<String>ans = new ArrayList<>();

        for(String s : words){
            //System.out.print(s);
        if(check(s)){
            ans.add(s);
            //System.out.print(ans);
            }
        }
        String[] st = new String[ans.size()];
        int i = 0;
        // String[] a2 = new String[0];
        if(ans.size() == 0)return st;
        for(String s: ans)st[i++] = s; 
        return st;
        

    }
}
