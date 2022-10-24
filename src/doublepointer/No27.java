package doublepointer;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/24 17:04 </b><br />
 */
public class No27 {

    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {

        int l = 0, r = 0;

        while (r < nums.length){
            while (nums[r] == val){
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
