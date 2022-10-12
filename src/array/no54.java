package java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/8/2 11:17
 *
 * @author MoQuan
 */
public class no54 {

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        int rLen = matrix.length;
        int cLen = matrix[0].length;
        int len = rLen * cLen;

        ArrayList<Integer> ans = new ArrayList<>(len);

        int size = 0;
        //  row    column
        int r = 0, c = 0;
        int loopSize = 0;
        while (size < len) {

            // 右
            while (c < cLen - loopSize && size < len) {
                ans.add(matrix[r][c]);
                size++;
                c++;
            }
            c--;
            r++;

            // 下
            while (r < rLen - loopSize && size < len) {
                ans.add(matrix[r][c]);
                size++;
                r++;
            }
            r--;
            c--;

            // 左
            while (c >= loopSize && size < len) {
                ans.add(matrix[r][c]);
                size++;
                c--;
            }
            c++;
            r--;

            loopSize++;

            // 上
            while (r >= loopSize && size < len) {
                ans.add(matrix[r][c]);
                size++;
                r--;
            }
            r++;
            c++;
        }

        return ans;
    }

}
