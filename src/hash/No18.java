package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/20 17:55 </b><br />
 */
public class No18 {

    public static void main(String[] args) {

        System.out.println(fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296));

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> answer = new ArrayList<>();

        int i = 0;
        int j, l, r;

        int length = nums.length;
        while (i < length){
            // i 去重
            if(i > 0 && nums[i - 1] == nums[i]){
                i++;
                continue;
            }
            j = i + 1;
            while (j < length){
                // j 去重
                if(j > i + 1 && nums[j - 1] == nums[j]){
                    j++;
                    continue;
                }

                l = j + 1;
                r = length - 1;

                while (l < r){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r] - target;

                    if(sum == 0){
                        answer.add(Arrays.asList(nums[i] , nums[j] , nums[l] , nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    }else if(sum < 0){
                        l++;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                    }else {
                        r--;
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    }

                }

                j++;
            }

            i++;
        }

        return answer;
    }

}
