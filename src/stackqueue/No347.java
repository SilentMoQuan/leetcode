package stackqueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/28 11:47 </b><br />
 */
public class No347 {

    public static void main(String[] args) {
        No347 object = new No347();

        System.out.println(Arrays.toString(object.topKFrequent(new int[]{6, 6, 6, 2, 2, 9}, 2)));
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a,b) -> b[1] - a[1]);

        for (Integer key : map.keySet()) {
            queue.add(new int[]{key, map.get(key)});
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {

            ans[i] = queue.poll()[0];

        }

        return ans;
    }

}
