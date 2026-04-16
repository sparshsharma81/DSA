import java.util.*;
class mirror_frequency {

    public int mirrorFrequency(String s) {
        HashMap<Character, Integer> h1 = new HashMap<>();

        for (char c : s.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }

        int ans = 0;

        for (Map.Entry<Character, Integer> h : h1.entrySet()) {
            char ch = h.getKey();
            char mirror;

            if (Character.isDigit(ch)) {
                mirror = (char) ('0' + (9 - (ch - '0')));
            } else {
                mirror = (char) ('z' - (ch - 'a'));
            }

            // avoid double counting
            if (ch <= mirror) {
                int f1 = h1.get(ch);
                int f2 = h1.getOrDefault(mirror, 0);

                ans += Math.abs(f1 - f2);  // or Math.min(f1, f2) depending on question
            }
        }

        return ans;
    }
}