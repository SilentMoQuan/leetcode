package java.Dfs;

import org.omg.PortableServer.AdapterActivator;

import java.util.*;

public class no39main {

    private static List<List<Integer>> answer;
    //private static HashMap<HashMap<Integer, Integer>, Boolean> flag = new HashMap<>();

    //private static HashMap<Integer, Integer> data;

    public static void main(String[] args) {
        //System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(combinationSum(new int[]{2, 3, 5}, 8));
    }

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {

        answer = new ArrayList<>();

        if (candidates.length == 0)
            return answer;

        Arrays.sort(candidates);

        dfs(new LinkedList<>(), target, candidates, 0);

        return answer;
    }

    static public void dfs(Deque<Integer> ans, int target, int[] datas, int begin) {

        if (target == 0){
            answer.add(new ArrayList<Integer>(ans));
            return;
        }

        for (int i = begin; i < datas.length; i++){
            if(datas[i] > target)
                return;

            ans.addLast(datas[i]);
            dfs(ans, target - datas[i], datas, i);
            ans.removeLast();
        }
    }
}
