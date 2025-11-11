import java.util.ArrayList;

public class arraylist_permutation {
    public static ArrayList<ArrayList<Integer>> h1 = new ArrayList<>();
     public void permutations(ArrayList<Integer> s, ArrayList<Integer> up) {
        if (up.isEmpty()) {
            h1.add(new ArrayList<>(s));
            return;
        }

        for (int idx = 0; idx < up.size(); idx++) {
            int ch = up.get(idx);
            ArrayList<Integer> newUp = new ArrayList<>(up);
            newUp.remove(idx);
            ArrayList<Integer> newS = new ArrayList<>(s);
            newS.add(ch);
            permutations(newS, newUp);
        }
    }

}
