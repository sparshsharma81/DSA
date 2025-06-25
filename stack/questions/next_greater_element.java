import java.util.*;
public class next_greater_element {
    private static int[]h1(int[]arr){
      int n = arr.length;
        int[]arr2 = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        // arr[n-1] = -1;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            arr2[i] = st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
            
        }
        return arr2;
    }
    public static void main(String args[]){

        //now we are finding the next greater element
        int[]arr = {1,3,2,1,8,6,3,4};
        int[]arr2 = h1(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] +" ");
        }
    }
}
