public class vowel_toString {
    
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean isvow(char ch2){
        char ch = Character.toLowerCase(ch2);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch== 'u')return true;
        return false;
    }
    public static TreeMap<Character,Integer> sol(String s){
        int answer =0;
        TreeMap<Character,Integer>h1 = new TreeMap<>();
        for(char c : s.toCharArray()){
            if(isvow(c)){
                h1.putIfAbsent(c,0);
                h1.put(c,h1.getOrDefault(c,0)+1);
        }
        }
        return h1;
    
    
}
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        //find frequenccy of vowel in a string 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character,Integer>h = new TreeMap<>();
        h = sol(s);
        h.putIfAbsent('a',0);
         h.putIfAbsent('e',0);
         
          h.putIfAbsent('i',0);
           h.putIfAbsent('o',0);
            h.putIfAbsent('u',0);
        for(Map.Entry<Character,Integer>h1 : h.entrySet()){
            System.out.println("Vowel: " + h1.getKey() + " value:" +h1.getValue());
        }
        System.out.println(h);
        
    }
}