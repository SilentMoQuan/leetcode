package greedy;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/12 13:05 </b><br />
 */
public class No376 {

    public int wiggleMaxLength(int[] nums) {

        int index = 0;

        int perDiff = 0;
        int currentDiff = 0;

        int ans = 1;

        while (index < nums.length - 1){

            currentDiff = nums[index + 1] - nums[index];

            if((currentDiff > 0 && perDiff <= 0) || (currentDiff < 0 && perDiff >= 0)){

                perDiff = currentDiff;
                ans++;

            }

            index++;
        }

        return ans;
    }


}
