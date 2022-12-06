package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/6 10:42 </b><br />
 */
public class No131 {

    public static void main(String[] args) {

        System.out.println(new No131().partition("aab"));

    }

    List<List<String>> answer = new ArrayList<>();
    LinkedList<String> list = new LinkedList<>();

    public List<List<String>> partition(String s) {

        backtracking(s, 0);

        return answer;
    }

    private void backtracking(String s, int index) {

        if (index >= s.length()){
            answer.add(new ArrayList<>(list));
            return;
        }

        int max = s.length() - index;

        for (int i = 1; i <= max; i++) {

            String substring = s.substring(index, index + i);

            if(!isPalindrome(substring)){
                continue;
            }

            list.add(substring);
            backtracking(s, index + i);
            list.removeLast();

        }

    }

    public boolean isPalindrome(String s){

        int l = 0, r = s.length() - 1;

        while (l < r){

            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

}
