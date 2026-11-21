public class Fair_candy_swap{
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice =0;
        int bob =0;
        for(int i=0;i<aliceSizes.length;i++){
            alice+=aliceSizes[i];
        }
        for(int j=0;j<bobSizes.length;j++){
            bob+=bobSizes[j];
        }
        int need = (bob - alice) /2;
        Set<Integer>s1 = new HashSet<>();
        for(int i:bobSizes){
            s1.add(i);
        }
      for(int a : aliceSizes){
        int need1 = a + need;
        if(s1.contains(need1)){
            return new int[]{a,need1};
        }
        
      }
      return new int[]{0,0};
    }
}