package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/20 15:04 </b><br />
 */
public class No1 {

    public static void main(String[] args) {



    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++){
            if (map.getOrDefault(target - nums[i], null) == null) {
                map.put(nums[i], i);
            }else{
                return new int[]{i, map.get(target - nums[i])};
            }
        }

        return null;
    }

}
