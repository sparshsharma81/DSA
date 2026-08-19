public class number_of_recent_calls{
    class RecentCounter {
    Queue<Integer>q1;

    public RecentCounter() {
        q1 = new LinkedList<>();
    }
    
    public int ping(int t) {
        q1.add(t);
        while(q1.peek() < t-3000){
            q1.poll();
        }        
        return q1.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
}