package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/2 8:59 </b><br />
 */
public class No17 {

    Map<String, Character[]> map = new HashMap<>(8);
    {
        map.put("2", new Character[]{'a', 'b', 'c'});
        map.put("3", new Character[]{'d', 'e', 'f'});
        map.put("4", new Character[]{'g', 'h', 'i'});
        map.put("5", new Character[]{'j', 'k', 'l'});
        map.put("6", new Character[]{'m', 'n', 'o'});
        map.put("7", new Character[]{'p', 'q', 'r', 's'});
        map.put("8", new Character[]{'t', 'u', 'v'});
        map.put("9", new Character[]{'w', 'x', 'y', 'z'});
    }

    List<String> answer = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()){
            return answer;
        }

        String[] numArr = digits.split("");

        backtracking(numArr, new StringBuilder(), 0);

        return answer;
    }

    private void backtracking(String[] numArr, StringBuilder builder, int index) {

        if(index >= numArr.length){
            answer.add(builder.toString());
            return;
        }

        Character[] chars = map.get(numArr[index]);

        for (int i = 0; i < chars.length; i++) {

            builder.append(chars[i]);
            backtracking(numArr, builder, index + 1);
            builder.deleteCharAt(builder.length() - 1);

        }

    }

}
