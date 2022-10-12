package java.string;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/8/6 10:36
 *
 * @author MoQuan
 */
public class no1408 {

    public static void main(String[] args) {

    }

    public static List<String> stringMatching(String[] words) {

        ArrayList<String> ans = new ArrayList<>();

        int len = words.length;

        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {

                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }

        }

        return ans;
    }

}
