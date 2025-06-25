public class remove_consecutive {
    private static ArrayList<Integer>h1(int[]arr){
        Stack<Integer>st = new Stack<>();
        ArrayList<Integer>h1 = new ArrayList<>();
         st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(st.peek() !=arr[i-1]){
                h1.push(arr[i-1]);
            }
        }
        // int[]arr2 = list.toArray(new int[h1.size()]);
        return h1;
    }
    public static void main(String args[]){
        //given a sequence of numbers ..remove all the consecutive sequence of length greater than or equal to 2

        int[]arr = {1,2,2,3,10,10,10,4,4,4,5,7,7};
        System.out.print(h1(arr));
    }
}
