class zero2 {
    public int countRemainingZerosOptimal(int m, int n, int[][] queries) {
        int minRow = m;
        int minCol = n;

        for (int[] q : queries) {
            minRow = Math.min(minRow, q[0]);
            minCol = Math.min(minCol, q[1]);
        }

        return m * n - (minRow * minCol);
    }

    public static void main(String[] args) {
        zero2 sol = new zero2();

        int m = 4;
        int n = 5;

        int[][] queries = {
            {3, 4},
            {2, 3},
            {1, 5},
            {2,5}
        };

        int remainingZeros = sol.countRemainingZerosOptimal(m, n, queries);
        System.out.println("Remaining zeros (optimal): " + remainingZeros);
    }
}
