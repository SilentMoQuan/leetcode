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
 * @date :<b> 2022/12/6 8:26 </b><br />
 */
public class No40 {

    List<List<Integer>> answer = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        backtracking(candidates, target, 0);

        return answer;
    }

    private void backtracking(int[] candidates, int target, int index) {

        if(target == 0){
            answer.add(new ArrayList<>(list));
        }

        if(index >= candidates.length){
            return;
        }

        for (int i = index; i < candidates.length && target > 0; i++){

            if (i > index && candidates[i] == candidates[i - 1]){
                continue;
            }

            list.add(candidates[i]);
            backtracking(candidates, target - candidates[i], i + 1);
            list.removeLast();
        }

    }

}
