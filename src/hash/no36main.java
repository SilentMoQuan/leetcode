package hash;

import java.util.HashMap;
import java.util.HashSet;

public class no36main {

    public static void main(String[] args) {
        System.out.println(isValidSudoku(new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        }));
    }

    static public boolean isValidSudoku(char[][] board) {

        HashMap<Character, Integer>[] rows = new HashMap[9];
        HashMap<Character, Integer>[] columns = new HashMap[9];
        HashMap<Character, Integer>[] boxes = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rows[i].getOrDefault(board[i][j], -1) != -1) {
                        return false;
                    } else {
                        rows[i].put(board[i][j], j);
                    }

                    if (columns[j].getOrDefault(board[i][j], -1) != -1) {
                        return false;
                    } else {
                        columns[j].put(board[i][j], i);
                    }

                    if (boxes[i / 3 + (j / 3 * 3)].getOrDefault(board[i][j], -1) != -1) {
                        return false;
                    } else {
                        boxes[i / 3 + (j / 3 * 3)].put(board[i][j], i);
                    }
                }
            }
        }

        return true;
    }
}
