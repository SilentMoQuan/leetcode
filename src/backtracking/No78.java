package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/6 17:33 </b><br />
 */
public class No78 {

    List<List<Integer>> answer = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {

        backtracking(nums, 0);

        return answer;
    }

    private void backtracking(int[] nums, int index) {

        answer.add(new ArrayList<>(list));

        if (index >= nums.length){
            return;
        }

        for (int i = index; i < nums.length; i++) {

            list.add(nums[i]);
            backtracking(nums, i + 1);
            list.removeLast();
        }


    }

}
