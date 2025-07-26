import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next(); 
        // if(s.length() %2 !=0)System.out.println("IGNORE HIM");
        // else System.out.println("CHAT WITH HER");
        HashSet<Character>set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);

        }
        if(set.size() %2 !=0)System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}