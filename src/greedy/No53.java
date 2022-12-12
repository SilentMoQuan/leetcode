package greedy;

/**
 * describe
 * <p>
 * 2022/12/12 22:02
 *
 * @author MoQuan
 */
public class No53 {

    public int maxSubArray(int[] nums) {

        int answer = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < nums.length; i++) {

            current += nums[i];

            if(current > answer){
                answer = current;
            }

            if (current < 0){
                current = 0;
            }

        }
        
        return answer;
    }

}
