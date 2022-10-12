package java.Dfs;

import java.util.ArrayList;
import java.util.List;

public class no22 {

    public static void main(String[] args) {

        List<String> ans = generateParenthesis(3);

        for(String item : ans){
            System.out.println(item);
        }
    }

    static public List<String> generateParenthesis(int n) {

        List<String> answer = new ArrayList<>();

        Dfs(answer, "", n, n);

        return answer;
    }

    static public void Dfs(List<String> answer, String ans, int l, int r) {

        if (l == r && r == 0) {
            answer.add(ans);
        }

        if (l <= r) {
            if (l > 0)
                Dfs(answer,ans+"(", l - 1, r);
            if (r > 0)
                Dfs(answer, ans+")", l, r - 1);
        } else if (r > 0) {
            Dfs(answer,ans+")", l, r - 1);
        }

    }

}
