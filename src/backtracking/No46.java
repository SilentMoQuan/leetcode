package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/12/6 21:41
 *
 * @author MoQuan
 */
public class No46 {

    List<List<Integer>> answer = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();
    int [] flagArr = new int[21];
    public List<List<Integer>> permute(int[] nums) {

        backtracking(nums, 0);

        return answer;
    }

    private void backtracking(int[] nums, int len) {

        if(len == nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0 ; i < nums.length; i++){

            if(flagArr[nums[i] + 10] == 0){

                flagArr[nums[i] + 10] = 1;

                list.add(nums[i]);
                backtracking(nums, len + 1);
                list.removeLast();

                flagArr[nums[i] + 10] = 0;
            }

        }


    }

}
