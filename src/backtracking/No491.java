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
 * @date :<b> 2022/12/6 17:47 </b><br />
 */
public class No491 {

    List<List<Integer>> answer = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {

        backtracking(nums,0, Integer.MIN_VALUE);

        return answer;
    }

    private void backtracking(int[] nums, int index, int per) {

        if (list.size() >= 2){
            answer.add(new ArrayList<>(list));
        }

        for (int i = index; i < nums.length; i++){

            if(nums[i] < per){
                continue;
            }

            list.add(nums[i]);
            backtracking(nums, i + 1, nums[i]);
            list.removeLast();
        }

    }

}
