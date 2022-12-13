package greedy;

/**
 * describe
 * <p>
 * 2022/12/13 21:10
 *
 * @author MoQuan
 */
public class No55 {

    public boolean canJump(int[] nums) {

        if(nums.length == 1) return true;

        int cover = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (i + cover > nums.length - 1) {
                return true;
            }

            if (0 == cover){
                return false;
            }

            cover = Math.max(cover - 1, nums[i]);

        }

        return true;
    }

}
