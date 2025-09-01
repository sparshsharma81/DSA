import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int a2 = 0;
        int a1 = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j] == 1){
                    a1 = i;
                    a2 = j;
                }
            }
        }

        //middle is 2,2
        int ans =0;
        ans += Math.abs(a1-2);
        ans+= Math.abs(a2-2);
        System.out.println(ans);


    }
}