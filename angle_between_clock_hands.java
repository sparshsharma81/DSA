public class angle_between_clock_hands{
    
    public double angleClock(int hour, int minutes) {
        //formula to find the angle between hour and minute hand is 
        //30H - 11/2M
        double h = 30 * (hour % 12);
        double m = (5.5) * minutes;
        // double a = (30 * hour) - (11/2)*(minutes);
        double ans =Math.abs(h  - m);
        double min = 360 - ans;
      
        return Math.min(Math.abs(min),ans);
    }

}