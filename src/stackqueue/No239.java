package stackqueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/27 10:33 </b><br />
 */
public class No239 {

    public static void main(String[] args) {
//        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7}; int k = 3;
//        int[] nums = {1, 3, 1, 2, 0, 5}; int k = 3;
//
        int[] nums = {-7, -8, 7, 5, 7, 1, 6, 0};
        int k = 4;
//        int[] nums = {1, -1};
//        int k = 1;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

        MyQueue queue = new MyQueue();
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            queue.push(nums[i]);
        }
        ans[0] = queue.peek();

        for (int i = k; i < nums.length; i++) {

            queue.push(nums[i]);
            queue.pop(nums[i - k]);

            ans[i - k + 1] = queue.peek();

        }

        return ans;
    }
    
    static class MyQueue {

        private  Deque<Integer> queue = new ArrayDeque<Integer>();

        public void push(int val){
            while (!queue.isEmpty() && val > queue.peekFirst()){
                queue.pollFirst();
            }

            queue.push(val);
        }

        public void pop(int value){
            if(!queue.isEmpty() && value == queue.peekLast()){
                queue.pollLast();
            }
        }

        public Integer peek(){
            return queue.peekLast();
        }

    }
    
    public static int[] maxSlidingWindowTimeOut2(int[] nums, int k) {

        if (k == 1) {
            return nums;
        }

        int[] ans = new int[nums.length - k + 1];
        // 初始化
        int l = 0, r = k - 1;
        int[] found = found(l, r, nums);
        int a = found[0];
        int b = found[1];
        ans[l] = nums[a];

        while (r < nums.length) {

            if(nums[r] > nums[a]){
                b = a;
                a = r;
            }else if(nums[r] > nums[b]){
                b = r;
            }

            if(l > 0 && l - 1 == a){

                if(b >= l){
                    a = b;
                }else{
                    found = found(l, r, nums);
                    a = found[0];
                    b = found[1];
                }

            }

            ans[l] = nums[a];

            l++;
            r++;
        }

        return ans;
    }

    public static int[] found(int l, int r, int[] nums) {

        int a = l;
        int b = l;

        for (int i = l; i <= r; i++) {
            a = Math.max(nums[a], nums[i]) == nums[i] ? i : a;
        }

        if(a == b){
            b = a + 1;
        }

        for (int i = l; i <= r; i++) {
            if (a != nums[i]) {
                b = Math.max(nums[b], nums[i]) == nums[i] ? i : b;
            }
        }

        return new  int[]{a, b};
    }

    public static int[] maxSlidingWindowTimeOut(int[] nums, int k) {

        int[] ans = new int[nums.length - k + 1];
        // 初始化
        int l = 0, r = 0;
        int max = nums[0];
        while (r < k - 1) {
            max = Math.max(max, nums[r]);
            r++;
        }
        ans[l] = Math.max(max, nums[r]);
        while (r < nums.length) {

            if (nums[r] > max) {
                max = nums[r];
            } else if (l > 0 && nums[l - 1] == max) {
                max = nums[l];
                for (int i = l; i <= r; i++) {
                    max = Math.max(max, nums[i]);
                }
            }
            ans[l] = max;

            l++;
            r++;
        }

        return ans;
    }

}
