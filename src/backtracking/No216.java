package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/12/1 21:46
 *
 * @author MoQuan
 */
public class No216 {

    public static void main(String[] args) {
        new No216().combinationSum3(9, 45);
    }

    LinkedList<Integer> group = new LinkedList<>();
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        int max = 0;
        int min = 0;

        for (int i = 0; i <= k; i++) {

            min += i;
            max += (9 - i);
        }

        if(max < n || min > n){
            return answer;
        }

        backtracking(k, n, 1);

        return answer;
    }

    private void backtracking(int k, int n, int index) {

        if(k == 0){
            if (n == 0){
                answer.add(new ArrayList<>(group));
            }
            return;
        }

        for (int i = index; i <= 9; i++) {

            group.add(i);
            backtracking(k - 1, n - i, i + 1);
            group.removeLast();
        }

    }

}
