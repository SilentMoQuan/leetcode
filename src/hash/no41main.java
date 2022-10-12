package java.hash;

public class no41main {

    public static void main(String[] args) {
        //System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
    }

    static public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] < n + 1 && nums[i] != nums[nums[i] - 1]) {
                int t = nums[i];
                nums[i] = nums[t - 1];
                nums[t - 1] = t;
            }
        }

        int ans = 0;

        while (ans < n) {
            if (ans + 1 != nums[ans])
                break;

            ans++;
        }

        return ans + 1;
    }
}
