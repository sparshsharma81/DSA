import java.util.Scanner;
//now we are implementing a code to count the number of zeros using recurssion
public class Main{
    public static int ans(int n,int count){
        if(n ==0)return count;
        if(n % 10 == 0){
            count++;
        }
        n/=10;
        return ans(n,count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
       count =  ans(a,count);
        System.out.println(count);
        
    }
}