import java.util.ArrayList;
import java.util.List;

public class Letter_case_Permutation {
    private static void work(String s, List<String>ans,int i,String s3){
        if(i == s.length()){
            ans.add(s3);
            return;
        }
        char ch = s.charAt(i);
        if(Character.isLetter(ch)){
            char ch1 = Character.toUpperCase(ch);
            char ch2 = Character.toLowerCase(ch);
            work(s,ans,i+1,s3+ch1);
            work(s,ans,i+1,s3+ch2);
        }
        else{
            work(s,ans,i+1,s3+ch);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String>ans = new ArrayList<>();
        work(s,ans,0,"");
        return ans;
    }

    
}
