package hash;

import java.util.*;
import java.util.stream.Collectors;

/**
 * describe
 * <p>
 * 2022/8/9 13:02
 *
 * @author MoQuan
 */
public class no349 {


    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> nums = new HashSet<>();

        for (int i : nums1) {

            nums.add(i);

        }

        HashSet<Integer> ans = new HashSet<>();

        for (int i : nums2) {
            if(nums.contains(i)){
                ans.add(i);
            }
        }

        return ans.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new no349().intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }



}
