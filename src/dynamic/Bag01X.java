package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/30 11:19 </b><br />
 */
public class Bag01X {

    public static void main(String[] args) {
        Bag01X bag01X = new Bag01X();

        int[] arr = bag01X.bag01X();

        for (int v : arr) {
            System.out.format("%4d", v);
        }

        System.out.println();

    }

    private int[] bag01X() {

        int[] weight = new int[]{1, 3, 4};
        int[] value = new int[]{15, 20, 30};

        int[] dp = new int[5];

        // init
        for (int i = 1; i < weight.length + 1; i++) {
            dp[i] = value[0];
        }

        for (int i = 0; i < value.length; i++) {

            for (int j = dp.length - 1; j > 0; j--) {

                if (j > weight[i]) {
                    dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
                }

            }

        }

        return dp;
    }


}
