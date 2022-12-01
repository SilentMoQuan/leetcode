package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/1 16:17 </b><br />
 */
public class No77 {

    int [] group;
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        group = new int[k];

        backTrucking(n, k);

        return answer;
    }

    private void backTrucking(int n, int k) {

        if (0 >= k){
            answer.add(arrayToList(group));
            return;
        }

        for (int i = n; i >= k; i--){
            group[group.length - k] = i;
            backTrucking(i - 1, k - 1);
        }

    }

    private List<Integer> arrayToList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

}
