package java.array;

/**
 * describe
 * <p>
 * 2022/6/21 19:54
 *
 * @author MoQuan
 */
public class no209 {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int start = 0, end = 0;

        int answer = 0;

        int sum = 0;

        while (true) {

            if (sum >= target) {

                if(end >= nums.length){
                    break;
                }

                if (answer == 0 || start - end < answer) {
                    answer = start - end;
                }

                sum -= nums[end];
                end++;
            } else {

                if(start >= nums.length){
                    break;
                }

                sum += nums[start];
                start++;
            }


        }

        return answer;
    }

}


