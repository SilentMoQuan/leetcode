package greedy;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 8:37 </b><br />
 */
public class No738 {

    public static void main(String[] args) {
        No738 no738 = new No738();
        System.out.println(no738.monotoneIncreasingDigits(603253281));
    }

    long answer = 0;

    public int monotoneIncreasingDigits(int n) {

        char[] chars = (n + "").toCharArray();

        int index = chars.length;

        for (int i = chars.length - 1; i > 0; i--) {

            if (chars[i - 1] > chars[i]) {
                chars[i - 1]--;
                index = i;
            }

        }

        for (int i = index; i < chars.length; i++) {
            chars[i] = '9';
        }

        return Integer.parseInt(String.valueOf(chars));
    }

    public int monotoneIncreasingDigitsOld(int n) {

        if (n < 10) {
            return n;
        }

        recursion(0, n, (n + "").length(), false);

        return (int) answer;
    }

    /**
     * describe
     * <br />
     *
     * @param result 结果
     * @param n      题目值
     * @param len    递归层数控制
     * @param ten    是否出现了借位
     * @return boolean
     * @author wyh
     * @date 2022/12/23 9:28
     */
    private boolean recursion(long result, int n, int len, boolean ten) {

        // 到最后了 直接输出即可, 每个位置都是其最大位置
        if (len == 0) {
            answer = result / 10;
            return true;
        }

        // 当前位置的最大值
        int number = (int) (n / Math.pow(10, len - 1));

        int current = number % 10;

        if (ten) {
            current = 9;
        }

        // 从最大值逐个递减, 但必须大于等于上一位
        for (int i = current; i >= result / 10 % 10; i--) {

            if (recursion((result + i) * 10, n, len - 1, i < current || ten)) {
                return true;
            }

        }

        return false;
    }

}
