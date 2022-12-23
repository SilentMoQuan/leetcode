package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 13:57 </b><br />
 */
public class No62 {

    public int uniquePaths(int m, int n) {

        if (m == 1 || n == 1) {
            return 1;
        }

        // dp[m][n] : 到 m 行 n 列位置有 dp[m][n] 种走法
        int[][] dp = new int[m][n];

        /*
            0  1  1  1
            1  2  3  4
            1  3  6 10
            1  4 10 20

            dp[m][n] = dp[m - 1][n] + dp[m][n - 1]
         */

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

}
