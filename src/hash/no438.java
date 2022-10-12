package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/8/9 12:01
 *
 * @author MoQuan
 */
public class no438 {

    public List<Integer> findAnagrams(String s, String p) {

        int len = p.length();
        if (len > s.length()){
            return new ArrayList<>();
        }
        int start = 0;
        int end = len - 1;

        int [] arr = new int[26];
        int [] checkArr = new int[26];

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < len; i++) {

            arr[s.charAt(i) - 'a'] -= 1;
            arr[p.charAt(i) - 'a'] += 1;

        }

        while (end < s.length()){

            arr[s.charAt(start++) - 'a'] += 1;
            arr[s.charAt(++end) - 'a'] -= 1;

            if (Arrays.equals(arr, checkArr)) {
                ans.add(start);
            }


        }

        if (Arrays.equals(arr, checkArr)) {
            ans.add(start);
        }

        return ans;
    }

    public static void main(String[] args) {
        no438 demo = new no438();
        System.out.println(demo.findAnagrams("cbaebabacd", "abc"));

    }

/*

执行用时：1891 ms, 在所有 Java 提交中击败了5.00%的用户
内存消耗：42.5 MB, 在所有 Java 提交中击败了53.28%的用户
通过测试用例：61 / 61

    char[] targetArr;
    int len;

    public List<Integer> findAnagrams(String s, String p) {

        ArrayList<Integer> ans = new ArrayList<>();
        len = p.length();

        targetArr = p.toCharArray();
        Arrays.sort(targetArr);

        for (int i = 0; i < s.length() - len + 1; i++) {

            char[] source = s.substring(i, i + len).toCharArray();
            Arrays.sort(source);

            if(sameCheck(source)){
                ans.add(i);
            }

        }

        return ans;
    }

    public boolean sameCheck(char[] source){

        for (int i = 0; i < len; i++) {

            if(source[i] != targetArr[i]){
                return false;
            }

        }

        return true;
    }
*/

}
