package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/6 17:31 </b><br />
 */
public class No93 {

    public static void main(String[] args) {
        System.out.println(new No93().restoreIpAddresses("101023"));
    }

    List<String> answer = new ArrayList<>();
    StringBuilder builder = new StringBuilder();

    public List<String> restoreIpAddresses(String s) {

        if (s.length() > 12 || s.length() < 4) {
            return answer;
        }

        backtracking(s.toCharArray(), 0, 0);

        return answer;
    }

    private void backtracking(char[] arr, int index, int level) {

        if (level == 4 && index == arr.length) {
            builder.deleteCharAt(builder.length() - 1);
            answer.add(builder.toString());
            return;
        }

        if (level >= 4 || index >= arr.length) {
            return;
        }
        int initIndex = builder.length() - 1;
        int sum = 0;
        boolean isOne = false;
        for (int i = 0; i < 3 && i + index < arr.length && !isOne; i++) {

            if((sum = sum * 10 + (arr[i + index] - 48)) > 255){
                break;
            }

            if(arr[index] == 48){
                isOne = true;
            }

            builder.append(sum).append('.');
            backtracking(arr, index + i + 1, level + 1);
            builder.delete(initIndex + 1, builder.length());
        }

    }

}
