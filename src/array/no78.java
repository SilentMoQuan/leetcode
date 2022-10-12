package java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * describe
 * <p>
 * 2022/7/30 10:17
 *
 * @author MoQuan
 */
public class no78 {

    public static void main(String[] args) {

        for (List<Integer> list : subsets(new int[]{1,9,8,3,-1,0})) {
            System.out.println(list);
        }

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = null;

        for (int flag = 0; flag < (1 << nums.length); flag++) {
            temp = new ArrayList<>();

            for (int i = 0; i < (1 << nums.length); i++){
                if((flag & (1 << i)) != 0){
                    temp.add(nums[i]);
                }
            }

            ans.add(temp);
        }

        return ans;
    }

}
