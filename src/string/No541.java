package string;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/20 17:24 </b><br />
 */
public class No541 {

    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {
        char[] array = s.toCharArray();

        int length = array.length;
        for (int i = 0; i < length; i += k * 2) {

            if (i + k < length) {
                reverse(array, i, i + k - 1);
            } else {
                reverse(array, i, length - 1);
            }

        }

        return new String(array);
    }

    public String reverseStrOld(String s, int k) {

        boolean flag = true;

        char[] array = s.toCharArray();

        int end = array.length - array.length % k;

        for (int i = 0; i < end; i++) {

            if ((i + 1) % k == 0 && flag) {
                reverse(array, i - k + 1, i);
                flag = false;
            } else if ((i + 1) % k == 0) {
                flag = true;
            }

        }

        if (flag) {
            reverse(array, end, array.length - 1);
        }

        return new String(array);
    }

    public void reverse(char[] array, int l, int r) {

        if (l < 0) {
            l = 0;
        }

        char temp;

        while (l < r) {

            temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            l++;
            r--;
        }
    }

}
