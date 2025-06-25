public class previous_greater_element {
    public static ArrayList<Integer>pge(int[]arr){
        ArrayList<Integer>h2 = new ArrayList<>();
        Stack<Integer>h1 = new Stack<>();
        int n = arr.length;
        st.push(arr[0]);
        h1.add(-1);
        for(int i=1;i<n;i++){
            while(st.peek() >=arr[i] && !st.isEmpty()){
                st.pop();
            }
            st.push(arr[i]);
            h2.add(st.isEmpty()?-1:st.peek());

        }
        return h2;
    }
    public static void main(String args[]){
        //now we are finding the previous greater element..
        int[]arr = {1,4,51,7,2,34,2,1,6,623,7,214,4};
        System.out.print(pge(arr));
    }
}
