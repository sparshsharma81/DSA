package HashTable;

import java.util.Hashtable;

public class hashtable {
    public static void main(String args[]) {
        System.out.println("Hello, HashTable!");
        //here this is hashtable..which is implementaiton of map in java
        //hashtable is legacy class which was intoroduced in JDK 1.0 
        //hashtable is synchronized and thread safe 
        //hashtabe is slightly slower than hashmap
        //hashtable does not allow null keys and values
        //hashtable is used in legacy code and is not recommended for new code
        //hashtable is a part of java.util package 
        //hashtable stores hetor`ogeneous objects

        //working of hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("one", 1);
        hashtable.put("two", 2);
        //here is hashcollision will happen 
        
    }
}
