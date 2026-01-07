package Subsets;
import java.util.*;
public class Print_All_Subsets {
    public static void subset(int[] arr , ArrayList<ArrayList<Integer>>h1, int i,ArrayList<Integer>a1){
        if(i == arr.length){
            h1.add(new ArrayList<>(a1));
            return;
        }
        //not take case

        subset(arr,h1,i+1,a1);
        a1.add(arr[i]);
        subset(arr,h1,i+1,a1);
        a1.remove(a1.size()-1);

    }
    public static void main(String args[]){
        //now we will print all the subsets 
        int[] arr = new int[]{1,4,5};
        ArrayList<ArrayList<Integer>>sub = new ArrayList<>();
        subset(arr,sub,0,new ArrayList<>());
        System.out.println(sub);
    }
}
