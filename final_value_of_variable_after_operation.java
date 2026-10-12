public class final_value_of_variable_after_operation {
    public int finalValueAfterOperations(String[] o) {
        int x =0;
       for(String s : o){
        if(s.charAt(0) == '-' || s.charAt(2) == '-')x--;
        else x++;
       }
        return x;
}
}
