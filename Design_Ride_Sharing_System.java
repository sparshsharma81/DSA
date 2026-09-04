class RideSharingSystem {
    HashMap<Integer,Integer>rider;
    HashMap<Integer,Integer>driver;

    public RideSharingSystem() {
        rider = new LinkedHashMap<>();
        driver = new LinkedHashMap<>();
        
    }
    
    public void addRider(int riderId) {
        rider.put(riderId,0);
        
    }
    
    public void addDriver(int driverId) {
        driver.put(driverId,0);
    }
    
    public int[] matchDriverWithRider() {
        int r = -1;
        int d =-1;
        if(rider.size() == 0 || driver.size() ==0)return new int[]{-1,-1};
        

        // rider.getFirst()

        for(Map.Entry<Integer,Integer>r2 : rider.entrySet()){
           if(r==-1)r = r2.getKey();
         
            for(Map.Entry<Integer,Integer>d2 : driver.entrySet()){
              
                    d = d2.getKey();
                    break;
               
            
            }

            
        }
            rider.remove(r);
            driver.remove(d);

            return new int[]{d,r};
        
    }
    
    public void cancelRider(int riderId) {
        if(rider.containsKey(riderId))rider.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */