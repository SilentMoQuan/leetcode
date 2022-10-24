package string;

import java.sql.Ref;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/24 14:15 </b><br />
 */
public class No459 {

    public static void main(String[] args) {

        repeatedSubstringPattern("a");

    }

    public static boolean repeatedSubstringPattern(String s) {

        int j = 0;
        int length = s.length();
        int[] next = new int[length];
        next[0] = 0;

        for (int i = 1; i < length; i++){

            while (j > 0 && s.charAt(j) != s.charAt(i)){
                j = next[j - 1];
            }

            if(s.charAt(j) == s.charAt(i)){
                j++;
            }

            next[i] = j;
        }

        return next[length - 1] > 0  && length % (length - next[length - 1]) == 0;
    }

}
