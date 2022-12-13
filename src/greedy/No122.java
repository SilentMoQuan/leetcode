package greedy;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/13 8:39 </b><br />
 */
public class No122 {

    public int maxProfit(int[] prices) {

        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            max += Math.max((prices[i] - prices[i - 1]), 0);
        }

        return max;
    }

}
