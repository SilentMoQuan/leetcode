package java.Dfs;

import java.util.*;

public class no40main {

    private static List<List<Integer>> answer;

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }

    static public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        answer = new ArrayList<>();

        if (candidates.length == 0)
            return answer;

        Arrays.sort(candidates);

        dfs(candidates, target, new ArrayDeque<>(), 0);

        return answer;
    }

    static public void dfs(int[] numbers, int target, Deque<Integer> path, int begin) {

        if (target == 0) {
            answer.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < numbers.length; i++) {
            if (target < numbers[i]) {
                break;
            }

            if (i > begin && numbers[i] == numbers[i - 1])
                continue;

            path.addLast(numbers[i]);
            dfs(numbers, target - numbers[i], path, i + 1);
            path.removeLast();
        }
    }
}
