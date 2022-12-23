package greedy;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 10:44 </b><br />
 */
public class No714 {

    public static void main(String[] args) {

        System.out.println(new No714().maxProfit(new int[]{1,3,7,5,10,3}, 3));

    }

    public int maxProfit(int[] prices, int fee) {

        int result = 0;

        int buy = prices[0] + fee;

        for (int i = 1; i < prices.length; i++) {

            if(buy > prices[i] + fee){
                buy = prices[i] + fee;
            }

            if(prices[i] > buy){
                result += (prices[i] - buy);
                buy = prices[i];
            }

        }

        return result;
    }

}
