package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/12/6 22:13
 *
 * @author MoQuan
 */
public class No47 {

    public static void main(String[] args) {
        new No47().permuteUnique(new int[]{1,1,2});
    }

    List<List<Integer>> answer = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    boolean[] flagArr;

    public List<List<Integer>> permuteUnique(int[] nums) {
        flagArr = new boolean[nums.length];
        Arrays.sort(nums);

        backtracking(nums, 0);

        return answer;
    }

    private void backtracking(int[] nums, int len) {

        if (len == nums.length) {
            answer.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i - 1] == nums[i] && !flagArr[i-1]) {
                continue;
            }

            if (!flagArr[i]){
                flagArr[i] = true;
                list.add(nums[i]);
                backtracking(nums, len + 1);
                list.removeLast();
                flagArr[i] = false;
            }

        }

    }

}
