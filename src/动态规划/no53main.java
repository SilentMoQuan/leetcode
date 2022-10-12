package java.动态规划;

import com.sun.xml.internal.ws.addressing.policy.AddressingPolicyMapConfigurator;

import java.util.Arrays;

public class no53main {

    public static void main(String[] args) {


    }

    static public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int ans = max;
        int p = 0;
        int[] dp = new int[n];

        dp[0] = nums[0];

        for(int j = 1; j < n ;j++){
            dp[j] = nums[j];
            for (int i = j; i < n; i++) {
                dp[i] = dp[i - 1] + nums[i];
                if (max <= dp[i]) {
                    max = dp[i];
                } else {
                    ans = Math.max(ans, max);
                    break;
                }
            }
        }

        return ans;
    }
}
