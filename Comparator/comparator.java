import java.util.*;
public class comparator{
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        // // Collections.sort(numbers, new Comparator<Integer>() {
        // //     @Override
        // //     public int compare(Integer o1, Integer o2) {
        // //         return o1.compareTo(o2);
        // //     }
        // // });
        // numbers.sort((a,b)->b.compareTo(a)); //this is lamda function usage
        // System.out.println(numbers);
       List<String>names = List.of("Alice","Bob","Charlie");
       Collections.sort(names, new Comparator<String>(){
        @Override
        public int compare(String a1 , String a2){
            return a1.compareTo(a2); //comparing strings in natural order
        }
       });
       System.out.println(names);   
    }
}