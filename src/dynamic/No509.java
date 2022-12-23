package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 13:21 </b><br />
 */
public class No509 {

    public int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int [] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        int i = 2;
        while (i <= n){
            dp[i] = dp[i - 1] + dp[i - 2];
            i++;
        }

        return dp[n];
    }

}
