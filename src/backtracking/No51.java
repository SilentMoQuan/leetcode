package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/8 17:29 </b><br />
 */
public class No51 {

    List<List<String>> answer = new ArrayList<>();
    char[][] map = null;

    public List<List<String>> solveNQueens(int n) {

        map = new char[n][n];

        for (char[] chars : map) {

            Arrays.fill(chars, '.');

        }

        backtracking(0, n);

        return answer;
    }


    public void backtracking(int level, int n) {

        if (level == n) {

            ArrayList<String> list = new ArrayList<>();

            for (char[] chars : map) {
                list.add(String.copyValueOf(chars));
            }

            answer.add(list);

            return;
        }

        char[] chars = map[level];
        for (int i = 0; i < chars.length; i++) {

            if (isValid(level, i)) {
                chars[i] = 'Q';
                backtracking(level + 1, n);
                chars[i] = '.';
            }


        }

    }

    private boolean isValid(int r, int c) {

        int len = map[0].length;

        for (int i = 0; i < len; i++) {
            if (map[i][c] == 'Q') {
                return false;
            }
        }

        for (int row = r - 1, column = c - 1; row >= 0 && column >= 0; row--, column--){
            if(map[row][column] == 'Q'){
                return false;
            }
        }

        for (int row = r - 1, column = c + 1; row >= 0 && column < len; row--, column++){
            if(map[row][column] == 'Q'){
                return false;
            }
        }

        return true;
    }

}
