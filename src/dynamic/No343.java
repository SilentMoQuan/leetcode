package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 14:41 </b><br />
 */
public class No343 {

    public int integerBreak(int n) {

        // dp[i] : 第 i 个数的最大值为 dp[i]
        int [] dp = new int[n + 1];

        for (int i = 2; i < n + 1; i++) {

            int max = 0;

            for (int j = 1; j < i; j++){
                max = Math.max(max, Math.max(j * (i - j), j * dp[i - j]));
            }

            dp[i] = max;
        }

        return dp[n];
    }

}
