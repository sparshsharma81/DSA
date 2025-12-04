import java.util.*;
public class decode_Enemy_msg {
    public static void decodeMessage(String e,int i,ArrayList<String>h1,int k) {
        if(i == e.length() || k == i){
            h1.add(e);
            return;
        }
     //0100011011
    //  char take = e.charAt(i);
    //  char skip;
    String s2 = e.substring(0,i) +e.substring(i+1,e.length());
    // System.out.println(s2 + " ");

   
    decodeMessage(s2, i,h1,k); //this one is for taking
     decodeMessage(e, i+1,h1,k); //this one is for not taking
     
    }

    public static void main(String[] args) {
        // String encodedMsg = "HWeolrllod ";
        String msg = "abc";
        int k = msg.length();
        // String decodedMsg = decodeMessage(encodedMsg);
        // System.out.println("Decoded Message: " + decodedMsg);
        ArrayList<String>h1 = new ArrayList<>();
        decodeMessage(msg, 0, h1,k);
        System.out.println(h1);
    }
    
}
