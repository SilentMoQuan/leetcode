package backtracking;

import java.util.Arrays;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/9 17:01 </b><br />
 */
public class No455 {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;
        while (i < s.length && j < g.length){

            if (s[i] >= g[j]){
                i++;
                j++;
            }else {
                i++;
            }

        }

        return j;
    }

}
