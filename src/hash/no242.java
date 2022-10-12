package java.hash;

import java.util.HashMap;
import java.util.HashSet;

/**
 * describe
 * <p>
 * 2022/8/8 10:01
 *
 * @author MoQuan
 */
public class no242 {

    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {

        int [] arr = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for (int i = 0; i < sArr.length; i++) {

            arr[sArr[i] - 'a'] += 1;
            arr[tArr[i] - 'a'] -= 1;

        }

        for (int sum : arr) {

            if(sum != 0){
                return false;
            }

        }

        return true;
    }

}
