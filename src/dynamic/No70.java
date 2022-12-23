package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 13:29 </b><br />
 */
public class No70 {

    public int climbStairs(int n) {

        if (n < 3) return n;

        // dp[i] : 到第 i 层 共有 dp[i] 中走法
        int[] dp = new int[n + 1];

        /*
            i = 1
                : 1
                -> 1
            i = 2
                : 2
                -> 1 + 1
                -> 2
            i = 3
                : 3
                -> 1 + 1 + 1
                -> 1 + 2
                -> 2 + 1

            dp[i - 1] -> dp[i] : dp[i - 1] + 1
            dp[i - 2] -> dp[i] : dp[i - 2] + 2

            dp[i] = dp[i - 1] + dp[i - 2]
         */

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
