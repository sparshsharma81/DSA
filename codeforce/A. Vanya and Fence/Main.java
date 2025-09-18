import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;
        for(int i=0;i<a;i++){
            int h = sc.nextInt();
            if(h > b){
                total += 2;
            } else {
                total += 1;
            }
        }
        System.out.println(total);
    }
}
