public class Kth_Small_prime_number{
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double[][] ar = new double[arr.length * arr.length][3];
        int i1 =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                     ar[i1][0] = arr[i];
                ar[i1][1] = arr[j];
                ar[i1][2] = ar[i1][0] / ar[i1][1];
                i1++;
                }
               
            }
        }
        int a1 =0;
        
        Arrays.sort(ar,(a,b) -> Double.compare(a[2] , b[2]));
        // for(double[] a : ar){
        //     for(double d : a)System.out.print(d + " ");
        //     System.out.println();
        // }
// k++;
        for(double[] a : ar){
            if(a[2] != 0.0){
                   a1++;
                if(a1 == k)return new int[]{(int)a[0],(int)a[1]};
             
                //   System.out.println("Not valiid " + " " + a[0] + " " + a[1] + " " + a1);
            }
          
        }
        return arr;
    }
}