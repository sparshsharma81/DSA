public class trapping_rain_water{
    public int trap(int[] height) {
        int n = height.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int total =0;
        leftSum[0]= height[0];
        rightSum[n-1] = height[n-1];
        //now we are calculating left prefix sum of the arrayy.....
        for(int i=1;i<n;i++){
            leftSum[i] = Math.max(height[i],leftSum[i-1]);
        }
        //now the left prefix sum has been calculated
        for(int i=n-2;i>=0;i--){
            rightSum[i] = Math.max(height[i],rightSum[i+1]);
        }
        //now sice we have calculated...
        for(int i=0;i<n;i++){
            total+= Math.min(leftSum[i],rightSum[i]) - height[i];

        }
        return total;
    }

}