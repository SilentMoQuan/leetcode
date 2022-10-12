package java.动态规划;

public class no32 {

    public static void main(String[] args) {

    }

    static public int longestValidParentheses(String s) {

        if (s == null || s.equals("") || s.length() < 2)
            return 0;

        int[] dp = new int[s.length()];
        dp[0] = 0;

        int answer = 0;

        int i;
        for (i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                dp[i] = 0;
            } else {
                if (i - 1 > -1 && s.charAt(i - 1) == '(')
                    if (i - 2 >= 0)
                        dp[i] = dp[i - 2] + 2;
                    else
                        dp[i] = 2;
                else if (i - 1 > -1 && i - dp[i - 1] - 1 > -1 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    if (i - dp[i - 1] - 2 > -1)
                        dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2];
                    else
                        dp[i] = dp[i - 1] + 2;
                } else {
                    dp[i] = 0;
                }
            }
            answer = Math.max(answer, dp[i]);
        }//for end

        return answer;
    }
}
