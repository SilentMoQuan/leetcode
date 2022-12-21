package greedy;

import java.util.Arrays;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/21 16:29 </b><br />
 */
public class No452 {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int answer = 1;

        for (int i = 1; i < points.length; i++) {

            if(points[i][0] > points[i-1][1]){
                answer++;
            }else {
                points[i][1] = Math.min(points[i][1], points[i - 1][1]);
            }

        }

        return answer;
    }

}
