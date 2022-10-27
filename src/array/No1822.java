package array;

import java.util.Arrays;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/27 10:25 </b><br />
 */
public class No1822 {

    public int arraySign(int[] nums) {
        int ans=1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                ans = -ans;
            }
        }
        return ans;
    }

    public int arraySignOld(int[] nums) {

        Arrays.sort(nums);

        int i = 0;

        int length = nums.length;
        while (i < length) {
            if (nums[i] >= 0) {

                if (nums[i] == 0) {
                    return 0;
                } else {
                    break;
                }

            }
            i++;
        }

        return (i % 2) == 0 ? 1 : -1;
    }

}
