package greedy;

import java.util.Arrays;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/21 14:16 </b><br />
 */
public class No135 {

    public int candy(int[] ratings) {

        if (ratings.length == 1) {
            return 1;
        }

        int[] answerArr = new int[ratings.length];

        answerArr[0] = 1;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                answerArr[i] = answerArr[i - 1] + 1;
            }else {
                answerArr[i] = 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i]) {
                answerArr[i] = Math.max(answerArr[i + 1] + 1, answerArr[i]);
            }else {
                answerArr[i] = Math.max(1, answerArr[i]);
            }
        }

        return Arrays.stream(answerArr).sum();
    }

}
