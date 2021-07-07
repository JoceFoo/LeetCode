package leetcodearray;

import java.util.Arrays;
import java.util.HashSet;

public class rotateImage {

    public static void rotate(int[][] matrix) {
        int[][] storage = new int[matrix.length][matrix.length];
        int temp = 0;
        int temp2 = matrix.length - 1;
        int length = matrix.length;
        while (length-- > 0) {
            for (int i = 0; i < matrix.length; i++) {
                storage[i][temp] = matrix[temp2][i];
            }
            temp++;
            temp2--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=storage[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate(matrix);
        int[][] matrix2 = new int[][]{
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };
         rotate(matrix2);
    }
}
