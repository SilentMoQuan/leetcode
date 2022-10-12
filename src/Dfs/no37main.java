package java.Dfs;

import java.util.Arrays;
import java.util.HashMap;

public class no37main {

    static private HashMap<Character, Integer>[] rows;
    static private HashMap<Character, Integer>[] columns;
    static private HashMap<Character, Integer>[] boxes;
    static private boolean flag = true;
    static char[][] ans;

    public static void main(String[] args) {
        solveSudoku(new char[][]{
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});

        System.out.println(Arrays.deepToString(ans));
    }

    static public void solveSudoku(char[][] board) {

        ans = board;

        rows = new HashMap[9];
        columns = new HashMap[9];
        boxes = new HashMap[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            boxes[i] = new HashMap<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                rows[i].put(board[i][j], 1);
                columns[j].put(board[i][j], 1);
                boxes[i / 3 + j / 3 * 3].put(board[i][j], 1);

            }
        }

        dfs(ans, 0, 0 );
    }

    static public void dfs(char[][] ans, int i, int j) {

        if (j >= 9) {
            j = 0;
            i++;
        }

        if (i >= 9) {
            flag = false;
            return;
        }

        if (ans[i][j] != '.')
            dfs(ans,i, j + 1);
        else {
            for (int t = 1; t < 10; t++) {
                char temp = (char) (t + '0');
                if (rows[i].getOrDefault(temp, -1) == -1 &&
                        columns[j].getOrDefault(temp, -1) == -1 &&
                        boxes[i / 3 + j / 3 * 3].getOrDefault(temp, -1) == -1) {

                    rows[i].put(temp, 1);
                    columns[j].put(temp, 1);
                    boxes[i / 3 + j / 3 * 3].put(temp, 1);
                    ans[i][j] = temp;

                    dfs(ans, i, j + 1);

                    if (flag) {
                        rows[i].remove(temp, 1);
                        columns[j].remove(temp, 1);
                        boxes[i / 3 + j / 3 * 3].remove(temp, 1);
                        ans[i][j] = '.';
                    }

                }
            }
        }

    }
}
