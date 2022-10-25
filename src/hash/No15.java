package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/20 16:44 </b><br />
 */
public class No15 {

    public static void main(String[] args) {
        threeSum(new int[]{-2,0,0,2,2});
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(nums);

        int len = nums.length;
        int i = 0, l = 1, r = len - 1;
        int sum;
        while (i < len) {

            if(nums[i] > 0){
                return answer;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            l = i + 1;
            r = len - 1;

            while (l < r) {

                sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    answer.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while (r > l && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (r > l && nums[r] == nums[r - 1]) {
                        r--;
                    }

                    l++;
                    r--;
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }

            }

            i++;
        }

        return answer;
    }

}
