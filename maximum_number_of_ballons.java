public class maximum_number_of_balloos{
    
    public int rearrangeCharacters(String s, String target) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[(int)c - 97]++;
        }
        int[] arr2 = new int[26];
        for(char c : target.toCharArray()){
            arr2[(int)c - 97]++;
        }

        // for(int i : arr)System.out.println(i + " ");

        
        int ans = Integer.MAX_VALUE;
        int i=0;
        while(i <26){
            int k1 = arr[i];
            int k2 = arr2[i];
            if(k2 >0){
                int k3 = k1 / k2;

            ans = Math.min(ans,k3);
            }
            i++;
        }

        return ans == Integer.MAX_VALUE?0 : ans;
    }

}