public class subsequence_arraylist_recurrsion {
    public static void print(java.util.ArrayList<Integer>p, java.util.ArrayList<Integer>up){
        if(up.size() == 0){
            System.out.println(p);
            return ;
        }

        //this .subList method is used to create a new arraylist from the existing arraylist
        int ch = up.get(0);
        java.util.ArrayList<Integer>newUp = new java.util.ArrayList<>();
        for(int i=1;i<up.size();i++)newUp.add(up.get(i));
        java.util.ArrayList<Integer>temp = new java.util.ArrayList<>(p);
        temp.add(ch);
        print(temp,newUp);
        print(p,newUp);
        
    }
    //now we are printing the subsequence of arraylist using recurrsion 
    public static void main(String args[]){
         java.util.ArrayList<Integer>arr = new java.util.ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        // arr.add(4);
        print(new java.util.ArrayList<>(), arr);
        //now we will print all the subsequeces of this arraylist using recurrsion
    }
}
