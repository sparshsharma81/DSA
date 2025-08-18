import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c - 'a']++;

        }
        boolean istrue = false;
        for(int i : arr){
            if(i==0){
                System.out.println("No");
                istrue = true;
                break;
            }
        }
        if(!istrue)System.out.println("Yes");

    }
}