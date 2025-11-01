public class Lexo_count {
    public static void main(String args[]){
        int[] arr = {1,12,10,102,41,2154};
        Collections.sort(arr,(a,b)->{
           return a.length() - b.length();
        })
    }
}
