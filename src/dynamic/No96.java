package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 15:15 </b><br />
 */
public class No96 {

    public int numTrees(int n) {

        // dp[i] :  i 个数的不同的二叉树有 dp[i] 个
        int [] dp = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                count += (dp[j] * dp[i - j]);
            }
            dp[i] = count;
        }

        return dp[n];
    }

}
