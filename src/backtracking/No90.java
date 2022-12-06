package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/6 17:42 </b><br />
 */
public class No90 {

    List<List<Integer>> answer = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        backtracking(nums, 0);

        return answer;
    }

    private void backtracking(int[] nums, int index) {

        answer.add(new ArrayList<>(list));

        if (index >= nums.length){
            return;
        }

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1]){
                continue;
            }

            list.add(nums[i]);
            backtracking(nums, i + 1);
            list.removeLast();
        }


    }

}
