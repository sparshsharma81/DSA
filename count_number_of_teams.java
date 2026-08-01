public class count_number_of_teams{
    public int numTeams(int[] rating) {
        int c= 0;
        int n = rating.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if((rating[i] < rating[j] && rating[j] < rating[k]) || 
                    (rating[i] > rating[j] && rating[j] > rating[k]))c++;
                }
            }
        }
        return c;
    }
}