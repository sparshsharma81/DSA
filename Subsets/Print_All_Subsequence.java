// package Subsets;
import java.util.HashSet;
public class Print_All_Subsequence {
     public static void work(String s, String up, HashSet<String>h1){
    if(up.length() ==0){
        h1.add(s);
        return;
    }
    char ch = up.charAt(0);
    for(int i=0;i<=s.length();i++){
        String f1  = s.substring(0,i);
        String f2 = s.substring(i,s.length());
        work(f1+ch+f2,up.substring(1),h1);

    }
}
    public static void subset(String s, String up, HashSet<String>h1){
        if(up.length() ==0){
            h1.add(s);
        return; 
          }
        char ch = up.charAt(0);
        subset(s+ch,up.substring(1),h1);
        subset(s,up.substring(1),h1);

    }
    public static void main(String args[]){
        String s = "abcd";
        HashSet<String>s1 = new HashSet<>();
         HashSet<String>s2 = new HashSet<>();
        subset("",s,s1);
        System.out.println(s1);
        int[] arr = new int[]{1,2,3,4,5,5};
        work("" , s,s2);
        System.out.println(s2);
    }
}
