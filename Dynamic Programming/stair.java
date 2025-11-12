// package Dynamic Programming;
import java.util.ArrayList;
public class stair {
    public static void main(String args[]){
    int[] arr = new int[]{1,2,3,1};
    ArrayList<ArrayList<Integer>>dp = new ArrayList<>();
    solve(dp,arr,0);
    }

    public static void solve(ArrayList<ArrayList<Integer>> dp, int[] arr, int i) {
        if (i == arr.length) {
            dp.add(new ArrayList<>());
            return;
        }
        solve(dp, arr, i + 1);
        for (ArrayList<Integer> list : dp) {
            list.add(arr[i]);
        }
    }
}

