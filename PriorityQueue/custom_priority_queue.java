import java.util.*;
// package PriorityQueue;

public class custom_priority_queue {
    public static void main(String[] args){
        //now we are implementing custom priority queue
        // PriorityQueue<String>pq = new PriorityQueue<>((a,b)->a.length() - b.length());
        // pq.add("apple");
        // pq.add("banana");   
        // pq.add("kivi");
        // System.out.println(pq);

        PriorityQueue<Integer>pq1 = new PriorityQueue<>(new Comparatory()=>{
            @Override
            public int compare(Integer a)
        })
    }
}
