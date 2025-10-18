import java.util.Scanner;
public class sorted_array {
    public static boolean sort(int[] arr,int index){
        if(index == arr.length)return true;
        return arr[index] < arr[index+1] && sort(arr,index+1);
    }
    public static void main(String args[]){
        //now we need to check whether the array is sorted or not
        int[] arr = {1,2,4,5,6,2,7,5};
        System.out.print(sort(arr,0));
    }
}
