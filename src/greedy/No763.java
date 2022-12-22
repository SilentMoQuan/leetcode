package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/22 11:08 </b><br />
 */
public class No763 {

    public List<Integer> partitionLabels(String s) {

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
        }

        ArrayList<Integer> result = new ArrayList<>();

        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {

            right = Math.max(right, arr[s.charAt(i) - 'a']);

            if (right == i) {
                result.add(right - left + 1);
                left = right + 1;
            }

        }

        return result;
    }

}
