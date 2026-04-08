public class longest_prefix_suffix {
    public static void main(String args[]){
        String s  = "abcab";
        int n = s.length();

        int[] lcp = new int[s.length()];
        int len =0;
        int i=0;
        while(i < s.length()){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lcp[i] = len;
                i++;
            }
            else{

                if(len!=0){
                    //now we gonna use fallback mechanism
                    len = lcp[len-1];

                }
                else{
                    lcp[i] = 0;
                    i++;

                }
            }
        }

        //now the last one is the answer
        

    }
}
