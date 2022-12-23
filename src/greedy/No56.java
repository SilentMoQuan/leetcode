package greedy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 8:15 </b><br />
 */
public class No56 {

    public int[][] merge(int[][] intervals) {

        if (intervals.length == 1) return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        int left = intervals[0][0];
        int right = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] > right){
                list.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }else{
                right = Math.max(intervals[i][1], right);
            }

        }

        list.add(new int[]{left, right});

        return list.toArray(new int[list.size()][]);
    }

}
