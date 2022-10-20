package string;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/20 17:19 </b><br />
 */
public class No344 {

    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {

        char temp;

        int l = 0, r = s.length -1 ;

        while (l < r){

            temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }
}

