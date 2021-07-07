package leetcodearray;

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!isValid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkRow(char[][] board, int row) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (set.contains(board[row][i])) {
                return false;
            }
            if (board[row][i] != '.') {
                set.add(board[row][i]);
            }
        }
        return true;
    }

    public static boolean checkColumn(char[][] board, int column) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            if (set.contains(board[i][column])) {
                return false;
            }
            if (board[i][column] != '.') {
                set.add(board[i][column]);
            }
        }
        return true;
    }

    public static boolean checkGrid(char[][] board, int startingRow, int startingColumn) {
        HashSet<Character> set = new HashSet<>();
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                char current = board[row + startingRow][column + startingColumn];
                if (set.contains(current)) {
                    return false;
                }
                if (current != '.') {
                    set.add(current);
                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int row, int column) {
        return checkRow(board, row) && checkColumn(board, column) && checkGrid(board, row - row % 3, column - column % 3);
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
            {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
            {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
            {'4', '.', '3', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println((isValidSudoku(board) ? "Yes" : "NO"));
    }
}
