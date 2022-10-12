package java.array;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/6/21 16:25
 *
 * @author MoQuan
 */
public class no997 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{0,2})));
    }

    public static int[] sortedSquares(int[] nums) {

        if (nums.length == 1){
            return new int[]{nums[0] * nums[0]};
        }

        int[] answer = new int[nums.length];

        int mid = -100000;

        int right, left;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] * nums[i - 1] < nums[i] * nums[i]) {
                mid = i - 1;
                break;
            }
        }

        if (mid == -100000) {
            mid = nums.length - 1;
        }

        if(mid == 0){
            left = 0;
            right = 1;
        }else{
            left = mid - 1;
            right = mid;
        }


        for (int i = 0; i < nums.length; i++) {


            if(left > -1 && right < nums.length){

                if(nums[left] * nums[left] <= nums[right] * nums[right]){

                    answer[i] = nums[left] * nums[left];
                    left--;

                }else{

                    answer[i] = nums[right] * nums[right];
                    right++;

                }

            }else if (left > -1){

                do {

                    answer[i] = nums[left] * nums[left];
                    left--;
                    i++;

                } while (left > -1);

            }else if(right < nums.length){

                do {

                    answer[i] = nums[right] * nums[right];
                    right++;
                    i++;

                }while (right < nums.length);

            }else {
                answer = null;
            }

        }

        return answer;
    }

}
