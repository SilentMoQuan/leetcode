package java.array;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/7/27 23:52
 *
 * @author MoQuan
 */
public class no59 {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(generateMatrix(4)));

    }

    public static int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];

        int start = 1;
        int x = 0, y = 0;

        while (start <= n * n) {
            // 右
            for (; y < n; y++) {

                if (ans[x][y] == 0) {
                    ans[x][y] = start++;
                } else {
                    break;
                }

            }
            y--;
            x++;
            // 下
            for (; x < n; x++) {

                if (ans[x][y] == 0) {
                    ans[x][y] = start++;
                } else {
                    break;
                }

            }
            x--;
            y--;
            // 左
            for (; y >= 0; y--) {

                if (ans[x][y] == 0) {
                    ans[x][y] = start++;
                } else {
                    break;
                }

            }
            y++;
            x--;
            // 上
            for (; x >= 0; x--) {

                if (ans[x][y] == 0) {
                    ans[x][y] = start++;
                } else {
                    break;
                }

            }
            x++;
            y++;
        }

        return ans;
    }

    public int right(int[][] ans, int start, int x, int y, int n) {

        for (; y < n; y++) {

            if (ans[x][y] != 0) {
                ans[x][y] = start++;
            } else {
                break;
            }

        }
        return start;
    }

    public int down(int[][] ans, int start, int x, int y, int n) {

        for (; x < n; x++) {

            if (ans[x][y] != 0) {
                ans[x][y] = start++;
            } else {
                break;
            }

        }
        return start;
    }

    public int left(int[][] ans, int start, int x, int y, int n) {

        for (; y >= 0; y--) {

            if (ans[x][y] != 0) {
                ans[x][y] = start++;
            } else {
                break;
            }

        }
        return start;
    }

    public int top(int[][] ans, int start, int x, int y, int n) {

        for (; x >= 0; x--) {

            if (ans[x][y] != 0) {
                ans[x][y] = start++;
            } else {
                break;
            }

        }
        return start;
    }

}
