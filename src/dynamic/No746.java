package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 13:40 </b><br />
 */
public class No746 {

    public int minCostClimbingStairs(int[] cost) {

        if(cost.length == 2){
            return Math.min(cost[0], cost[1]);
        }

        // dp[i] : 到第 i 层, 最小花费 dp[i]
        int [] dp = new int[cost.length];

        /*
            dp[i - 1] + cost[i] = dp[i]
            dp[i - 2] + cost[i] = dp[i]

            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i]
         */

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }

        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

}
