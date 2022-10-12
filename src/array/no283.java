package java.array;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/6/21 15:03
 *
 * @author MoQuan
 */
public class no283 {

    public static void main(String[] args) {
        int [] nums = new int[]{0};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {

        int now = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                if(i - now > 0){
                    nums[now] = nums[i];
                    nums[i] = 0;
                }

                now++;
            }

        }

    }

}
