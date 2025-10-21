import java.util.*;

public class subsequence_arraylist {
    public static List<List<Integer>>subset(int[] arr){
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer>inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
        //this one is the iterative method to print all the subsets of the arraylist
    }
    public static void main(String args[]){
        // List<List<Integer>>h1 = new ArrayList<>(1,2,3,4,5,6);
        int[] arr = {1,4,5};
        List<List<Integer>>ans = subset(arr);
        for(List<Integer>list : ans){
            System.out.println(list);
        }
    }
}
