import java.util.Arrays;

public class SaddlePointInMatrix {
    public static void main(String[] args) {
        // Saddle point of a matrix is an element in the matrix which is smallest in its
        // row and largest in its column
        // 6 3 1
        // 9 7 8
        // 2 4 5
        int[][] matrix = { { 6, 3, 1 }, { 9, 7, 8 }, { 2, 4, 5 } };
        int[] row = new int[matrix.length];
        Arrays.fill(row, Integer.MAX_VALUE);
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                row[i] = Math.min(row[i], matrix[i][j]);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++)
                col[i] = Math.max(col[i], matrix[j][i]);
        }
        for (int i = 0; i < row.length; i++) {
            if (row[i] == col[i])
                System.out.println(row[i]);
        }
    }
}
