import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Minimum_time_difference {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();        
        for(int i=0;i<timePoints.size();i++){
            int hour = Integer.parseInt(timePoints.get(i).substring(0,2));
            int minute = Integer.parseInt(timePoints.get(i).substring(3));
            int total = hour*60 + minute;
            minutes.add(total);
        }        
        Collections.sort(minutes);

  
        int min = Integer.MAX_VALUE;
        for(int i=1;i<minutes.size();i++){
            int min1 = minutes.get(i) - minutes.get(i-1);
        
            min = Math.min(min,min1);
              int first = minutes.get(0);
        int last = minutes.get(minutes.size() - 1);
        min = Math.min(min, 1440 - last + first);
        }
        
        return min;
        }

}
