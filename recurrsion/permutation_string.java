import java.util.PriorityQueue;


public class permutation_string {
    public static void perm(String s, String up, PriorityQueue<String>ab){
        if(up.length() ==0){
            ab.add(s);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i,s.length());
            perm(s1+ch+s2,up.substring(1),ab);   
        }
    }
    public static void main(String[] args) {
        String s= "abcde";
        PriorityQueue<String>ab = new PriorityQueue<>();
        perm("",s,ab);
        while(!ab.isEmpty()) System.out.print(ab.poll() + " ");
    }
}
