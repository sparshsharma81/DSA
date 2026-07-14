import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repeated_DNA_sequence {
    public List<String> findRepeatedDnaSequences(String s) {
        int i=0;
        int j=10;
        List<String>ans = new ArrayList<>();
        // String finl = s.substring(0,11);
        HashMap<String,Integer>h1 = new HashMap<>();
        while(j<=s.length()){
            StringBuilder s2 = new StringBuilder(s.substring(i,j));
            ArrayList<String>ar = new ArrayList<>();
            ar.add(s2.toString());
            Collections.sort(ar);
            // h1.put(s2.toString());
            h1.put(ar.get(0),h1.getOrDefault(ar.get(0),0)+1);
            i++;
            j++;
        }
        // System.out.println(h1);
        for(Map.Entry<String,Integer>h : h1.entrySet()){
            if(h.getValue()>1)ans.add(h.getKey());
        }
        return ans;
}
}
