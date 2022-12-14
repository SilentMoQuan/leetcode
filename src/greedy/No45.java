package greedy;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/14 8:44 </b><br />
 */
public class No45 {

    public int jump(int[] nums) {

        if(nums.length == 1) return 0;

        int count = 1;
        int cover = nums[0];
        int maxNumberIndex = 0;

        int i = 0;
        while (cover < nums.length - 1){

            while (i <= cover){
                if(i + nums[i] > cover){
                    maxNumberIndex = Math.max(maxNumberIndex + nums[maxNumberIndex], i + nums[i]) == i + nums[i]
                            ? i
                            : maxNumberIndex;
                }
                i++;
            }

            cover = maxNumberIndex + nums[maxNumberIndex];
            count++;
        }

        return count;
    }

}
