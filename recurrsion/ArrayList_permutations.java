public class ArrayList_permutations {
    /*
     class Solution {
    public static List<List<Integer>>h1 = new ArrayList<>();
    public static void permutations(ArrayList<Integer>s, ArrayList<Integer>up){
        if(up.size() == 0){
            // System.out.println(s);
            h1.add(new ArrayList<>(s));
            return;
        }
        int ch = up.get(0);
        for(int i=0;i<=s.size();i++){
            ArrayList<Integer>f1 = new ArrayList<>();
            ArrayList<Integer>q1 = new ArrayList<>();
            for(int j=0;j<i;j++)f1.add(s.get(j));
            for(int j = i;j<s.size();j++)q1.add(s.get(j));
            // String f = s.substring(0,i);
            // String q = s.substring(i,s.length());
        //    if(up.size()>0)up.remove(0);
        ArrayList<Integer>newUp = new ArrayList<>(up);
        if(newUp.size() >0)newUp.remove(0);
            ArrayList<Integer>an = new ArrayList<>();
            an.addAll(f1);
            an.add(ch);
            an.addAll(q1);
            permutations(an, newUp);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        //now we are solving the permumutations combinations question
       h1 = new ArrayList<>();
        ArrayList<Integer>h2 = new ArrayList<>();
        for(int i : nums)h2.add(i);
        permutations(new ArrayList<>(), h2);
        return h1;
    }
}
     */
}
