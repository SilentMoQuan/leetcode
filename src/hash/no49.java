package java.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/8/8 10:47
 *
 * @author MoQuan
 */
public class no49 {

    char[] source;
    int[] sourceArr;

    public static void main(String[] args) {

        no49 demo = new no49();

//        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs = new String[]{"a"};

        demo.groupAnagrams(strs).forEach(item -> {
            item.forEach(str -> {
                System.out.print(str);
                System.out.print("  ");
            });
            System.out.println();
        });
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        List<String> same = null;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) {
                continue;
            }

            same = new ArrayList<String>();
            source = strs[i].toCharArray();
            getSourceArr();
            same.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {

                if (strs[j] == null) {
                    continue;
                }

                if (strs[i].length() == strs[j].length()) {
                    if (check(strs[j].toCharArray())) {
                        same.add(strs[j]);
                        strs[j] = null;
                    }
                }

            }
            ans.add(same);
        }

        return ans;
    }

    public void getSourceArr() {
        sourceArr = new int[26];
        for (char c : source) {

            sourceArr[c - 'a'] += 1;

        }
    }

    public boolean check(char[] targetArr) {

        int[] check = sourceArr.clone();

        for (char c : targetArr) {

            check[c - 'a'] -= 1;

        }

        for (int i : check) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
