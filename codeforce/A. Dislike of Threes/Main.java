import java.util.*;
public class Main {
    private static int check(int a){
        int n1 =1;
      ArrayList<Integer>h1 = new ArrayList<>();
      while(h1.size()!=(a+1)){
        if(n1 % 3 !=0){
            if(n1 % 3 !=0){
                h1.add(n1);
            }
        }
        n1++;
      }
      return h1.get(a);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = check(a);
            System.out.println(b);
        }
    }
}
