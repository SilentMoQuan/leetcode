package doublepointer;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/25 11:49 </b><br />
 */
public class No977 {

    public static void main(String[] args) {
//        sortedSquares(new int[]{-7,-3,2,3,11});
        sortedSquares(new int[]{0, 1});
    }

    public static int[] sortedSquares(int[] nums) {

        if (nums.length == 1){
            return new int[]{nums[0] * nums[0]};
        }

        int length = nums.length;
        int[] answer = new int[length];
        int l = 0, r = length - 1;
        int max, lSquare = nums[l] * nums[l], rSquare = nums[r] * nums[r];

        for (int i = 0; i < length && l <= r; i++){

            max = Math.max(lSquare, rSquare);

            answer[length - 1 - i] = max;
            if(rSquare == lSquare && l == r){
                break;
            }

            if(max == lSquare){
                l++;
                lSquare = nums[l] * nums[l];
            }else{
                r--;
                rSquare = nums[r] * nums[r];
            }

        }

        return answer;
    }

}
