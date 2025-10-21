public class permutation {
    public static void permutations(String s, String up){
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=s.length();i++){
            String f = s.substring(0,i);
            String q = s.substring(i,s.length());
            permutations(f+ch+q, up.substring(1));
        }
    }
    public static void main(String args[]){
        //now we are printing all the permutations of a string
        String a = "abc";
        permutations("", a); 
    }
}
