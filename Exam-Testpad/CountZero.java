import java.util.*;

class CountZero{
    // Function to count remaining zeros after all queries
    public int countZeros(int m, int n, int[][] queries) {
        int minRow = m;
        int minCol = n;

        for (int[] q : queries) {
            minRow = Math.min(minRow, q[0]);
            minCol = Math.min(minCol, q[1]);
        }

        return m * n - (minRow * minCol);
    }

    // Optional: Print the final matrix for visualization
    public void printMatrix(int m, int n, int[][] queries) {
        int[][] matrix = new int[m][n];
        int minRow = m;
        int minCol = n;

        for (int[] q : queries) {
            minRow = Math.min(minRow, q[0]);
            minCol = Math.min(minCol, q[1]);
        }

        // Fill ones in the top-left rectangle
        for (int i = 0; i < minRow; i++) {
            for (int j = 0; j < minCol; j++) {
                matrix[i][j] = 1;
            }
        }

        // Print matrix
        System.out.println("Final matrix:");
        for (int i = 0; i < m; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Define matrix size
        int m = 4;
        int n = 5;

        // Define queries: each query = {row, col}
        int[][] queries = {
            {3, 4},
            {2, 3},
            {1, 5}
        };

        // Count remaining zeros
        int remainingZeros = sol.countZeros(m, n, queries);
        System.out.println("Remaining zeros: " + remainingZeros);

        // Optional: print matrix
        sol.printMatrix(m, n, queries);
    }
}
