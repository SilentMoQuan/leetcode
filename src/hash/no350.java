package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * describe
 * <p>
 * 2022/8/9 13:50
 *
 * @author MoQuan
 */
public class no350 {

    public int[] intersect(int[] nums1, int[] nums2) {

        // 使 nums1 < nums2
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i : nums2) {

            if (map.getOrDefault(i, 0) != 0) {
                map.put(i, map.get(i) - 1);
                ans.add(i);
            }

        }

        return ans.stream().mapToInt(x -> x).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new no350().intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}