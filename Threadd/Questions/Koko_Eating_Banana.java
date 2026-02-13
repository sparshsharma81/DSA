import java.util.Scanner;

/**
 * Professional implementation of the "Koko Eating Bananas" problem.
 *
 * Given an array of pile sizes and an integer h, find the minimum eating
 * speed (bananas per hour) so that all piles can be eaten within h hours.
 */
public class Koko_Eating_Banana {

    public static class Solution {

        /**
         * Check whether Koko can finish all piles at the given speed within h hours.
         * Uses ceil division: hours += (pile + speed - 1) / speed
         */
        private static boolean canFinish(int[] piles, int speed, int h) {
            long hours = 0L;
            for (int pile : piles) {
                hours += (pile + speed - 1) / speed;
                if (hours > h) return false; // early exit
            }
            return hours <= h;
        }

        /**
         * Binary-search the minimum feasible eating speed.
         * Time complexity: O(n log m) where m = max(piles).
         * Space complexity: O(1).
         */
        public int minEatingSpeed(int[] piles, int h) {
            if (piles == null || piles.length == 0) return 0;

            int maxPile = 0;
            for (int p : piles) maxPile = Math.max(maxPile, p);

            int low = 1, high = maxPile;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (canFinish(piles, mid, h)) {
                    high = mid; // mid might be the answer
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }

    /**
     * Simple CLI: reads input from stdin in the format:
     * n p1 p2 ... pn h
     * Example: 3 3 6 7 8 4   (n=3, piles=[3,6,7], h=8)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            if (!sc.hasNextInt()) {
                System.err.println("Expected input: n p1 p2 ... pn h");
                return;
            }

            int n = sc.nextInt();
            if (n < 0) {
                System.err.println("n must be non-negative");
                return;
            }

            int[] piles = new int[n];
            for (int i = 0; i < n; i++) {
                if (!sc.hasNextInt()) {
                    System.err.println("Insufficient pile values provided");
                    return;
                }
                piles[i] = sc.nextInt();
            }

            if (!sc.hasNextInt()) {
                System.err.println("Missing value for h (hours)");
                return;
            }
            int h = sc.nextInt();

            Solution solver = new Solution();
            int result = solver.minEatingSpeed(piles, h);
            System.out.println(result);
        } finally {
            sc.close();
        }
    }
}
