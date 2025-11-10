import java.util.Comparator;
import java.util.TreeMap;
public class TreeMap2 {
    public static void main(String args[]){
        //now we are implementing the tree map
        //basic property of treemap is that it stores key-value pairs in a sorted order
        //or it will store in naturally ordered way
        //like if you put treemap as integer it will store in ascending order which is natural behavior
        //like alphabetics ..they are sorted in natural order 
        ///there can be a case..where we have a custom key..or that is custom class 
        /// //in that case..we will have to provide the implmentation to java
        /// as java does not know how to sort that..
        /// so we have to provide our custom comparator..
        /// now we are implementing
    TreeMap<Integer, String> treemap = new TreeMap<>(new Comparator<Integer>() {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a; // descending order of keys
    }
});

treemap.put(1, "apple");
treemap.put(2, "banana");
treemap.put(3, "kiwi");

System.out.println(treemap);

    }
}
