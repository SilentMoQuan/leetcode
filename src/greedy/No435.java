package greedy;

import java.util.Arrays;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/22 8:37 </b><br />
 */
public class No435 {

    public int eraseOverlapIntervals(int[][] intervals) {

        int count = 1;

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int end = intervals[0][1];

        for (int[] interval : intervals) {

            if (interval[0] >= end){
                end = interval[1];
                count ++ ;
            }

        }

        return intervals.length - count;
    }

}
