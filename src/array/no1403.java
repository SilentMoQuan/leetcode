package java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/8/4 9:40
 *
 * @author MoQuan
 */
public class no1403 {

    public static void main(String[] args) {

    }

    public static List<Integer> minSubsequence(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        int sum = 0;
        int childrenSum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0 ; i--) {

            childrenSum += nums[i];
            ans.add(nums[i]);

            if(childrenSum > sum - childrenSum){
                break;
            }

        }

        return ans;
    }

}
