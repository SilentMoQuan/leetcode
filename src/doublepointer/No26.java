package doublepointer;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/24 17:12 </b><br />
 */
public class No26 {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {

        if(nums.length == 1){
            return nums.length;
        }

        int l = 1, r = 1;

        while (r < nums.length){
            while (nums[r] == nums[r-1]){
                r++;
                if(r >= nums.length){
                    return l;
                }
            }

            nums[l] = nums[r];

            l++;
            r++;
        }

        return l;
    }

}
