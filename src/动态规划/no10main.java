package java.动态规划;

public class no10main {

    public static void main(String[] args) {

        String s;
        String p;

        //s = "aab";
        //p = "c*a*b";
        //System.out.println(isMatch(s, p));
        //s="bbbba";
        //p=".*a*a";
        //System.out.println(isMatch(s, p));
        s="aaaaaaaa";
        p="a*aa";
        System.out.println(isMatch(s, p));

    }

    public static <T> void method(T a1){
    }

    static public boolean isMatch(String s, String p) {

        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

        dp[0][0] = true;

        int i = 0;
        int j = 0;
        for (i = 0; i <= s.length(); i++) {
            for (j = 1; j <= p.length(); j++) {

                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (matches(s, p, i, j-1)){
                        dp[i][j] = dp[i][j] || dp[i-1][j];
                    }
                }else{
                    if(matches(s, p, i, j)){
                        dp[i][j] = dp[i-1][j-1];
                    }
                }

                //if (s.charAt(i) == p.charAt(j)) {
                //    dp[i][j] = dp[i - 1][j - 1];
                //} else if (p.charAt(j) == '.') {
                //    dp[i][j] = dp[i - 1][j - 1];
                //} else if (p.charAt(j) == '*') {
                //    if (s.charAt(i) == p.charAt(j - 1)) {
                //        if (dp[i - 1][j])
                //            dp[i][j] = dp[i - 1][j];
                //        else if (dp[i][j - 2])
                //            dp[i][j] = dp[i][j - 2];
                //    } else {
                //        dp[i][j] = dp[i][j - 2];
                //    }
                //}
            }//for (j = 1; j < p.length(); j++)
        }

        return dp[s.length()][p.length()];
    }

    static public boolean matches(String s, String p, int i, int j) {

        if (i == 0) {
            return false;
        }

        if (p.charAt(j - 1) == '.') {
            return true;
        }

        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
