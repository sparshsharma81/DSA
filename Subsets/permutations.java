package Subsets;
import java.util.*;


public class permutations {
    public static void work(String s, String up, HashSet<String>h1){
    if(up.length() ==0){
        h1.add(s);
        return;
    }
    char ch = s.charAt(0);
    for(int i=0;i<=s.length();i++){
        String f1  = up.substring(0,i);
        String f2 = up.substring(i,s.length());
        work(f1+ch+f2,up.substring(1),h1);

    }
}
    public static void main(String args[]){

    
    String s = "abcd";
    HashSet<String>h1 = new HashSet<>();
    work("",s,h1);
    }
}
