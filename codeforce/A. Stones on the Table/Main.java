import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c =0;
        char curr = ' ';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                curr = 'R';
            }else if(s.charAt(i) == 'B'){
                curr = 'B';
            }
            else if(s.charAt(i) == 'G'){
                curr = 'G';
            } 



            if(curr == 'R' && s.charAt(i) == 'R'){
                c++;
            }else if(curr == 'B' && s.charAt(i) == 'B'){
                c++;
            }
            else if(curr == 'G' && s.charAt(i) == 'G'){
                c++;
            }
            else{
                curr = s.charAt(i);
            }
        }
        System.out.println(c);
    }
}