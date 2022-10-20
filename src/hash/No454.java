package hash;

import java.util.HashMap;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/20 16:26 </b><br />
 */
public class No454 {

    public static void main(String[] args) {

    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int size = nums1.length;
        int sumCount = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sumCount = map.getOrDefault(nums1[i] + nums2[j], 0);
                map.put(nums1[i] + nums2[j], sumCount + 1);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                count += map.getOrDefault(-(nums3[i] + nums4[j]), 0);
            }
        }

        return count;
    }

}
