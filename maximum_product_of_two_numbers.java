public class maximum_product_of_two_numbers{
    private int size(int n){
        int count =0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
    public int maxProduct(int n) {
    int a = n;
        int n1 = size(n);
        // System.out.println(size(n));
        int[]arr = new int[n1];
        if(n1 == 2){
            int first = n % 10;
            n/=10;
            int second = n % 10;
           return first * second;
            
        }
        for(int i=0;i<n1;i++){
            arr[i] = a % 10;
            a/=10;
        }
        // int index =-1;
        // int max1 =Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max1){
        //        max1 = Math.max(max1,arr[i]);
        //         index = i;
        //     }
            
            
        // }
        // int max2 = Integer.MIN_VALUE ;
        // arr[index] = Integer.MIN_VALUE+2;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max2){
        //         max2 = arr[i];
        //     }
        // }

        Arrays.sort(arr);
        
        return arr[n1-1] * arr[n1-2];
    }
}