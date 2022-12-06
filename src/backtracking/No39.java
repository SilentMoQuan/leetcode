package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/12/5 22:07
 *
 * @author MoQuan
 */
public class No39 {

    List<List<Integer>> answer = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtracking(candidates ,target, 0);

        return answer;
    }

    private void backtracking(int[] candidates, int target, int index) {

        if(target == 0){
            answer.add(new ArrayList<>(list));
            return;
        }

        if (index > candidates.length || target < 0){
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            list.add(candidates[i]);
            backtracking(candidates, target - candidates[i], i);
            list.removeLast();

        }

    }

}
