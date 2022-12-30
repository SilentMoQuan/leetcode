package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/30 11:19 </b><br />
 */
public class Bag01XY {

    public static void main(String[] args) {
        Bag01XY bag01XY = new Bag01XY();

        int[][] arr = bag01XY.bag01XY();

        for (int[] xArr : arr) {

            for (int v : xArr) {
                System.out.format("%4d", v);
            }

            System.out.println();

        }

    }

    private int[][] bag01XY() {

        int[] weight = new int[]{1, 3, 4};
        int[] value = new int[]{15, 20, 30};

        int[][] dp = new int[3][5];

        // init
        for (int i = 1; i < weight.length + 1; i++) {
            dp[0][i] = value[0];
        }

        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[i].length; j++) {

                if (j > weight[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }

            }

        }

        return dp;
    }


}
