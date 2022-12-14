package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/14 16:05 </b><br />
 */
public class No1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {

        int answer = 0;

        List<Integer> negativeList = new ArrayList<>();
        int minAbs = Integer.MAX_VALUE;

        for (int num : nums) {

            minAbs = Math.min(Math.abs(num), minAbs);

            if(num >= 0){
                answer += num;
            }else{
                negativeList.add(num);
            }

        }

        Collections.sort(negativeList);

        for (int i = 0; i < negativeList.size(); i++) {
            if (i < k)
                answer += -negativeList.get(i);
            else
                answer += negativeList.get(i);
        }

        if(k > negativeList.size() && (k - negativeList.size()) % 2 == 1){

            answer -= minAbs * 2;

        }

        return answer;
    }

}
