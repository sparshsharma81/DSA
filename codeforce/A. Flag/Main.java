import java.util.HashSet;

public class Main{
    public static void main(String args[]){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
      for(int i=0;i<n;i++){
        HashSet<Integer>set = new HashSet<>();
        set.add(arr[i][j]);
        for(int j=0;j<m;j++){
           if(set.contains(arr[i][j])){
            System.out.println("No")
           }
        }
      }
    }
}