package string;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/21 11:48 </b><br />
 */
public class JianZhi58 {

    public static void main(String[] args) {

    }

    public String reverseLeftWords(String s, int n) {

        char[] chars = s.toCharArray();

        swap(chars, 0, n - 1);
        swap(chars, n, chars.length - 1);
        swap(chars, 0, chars.length - 1);

        return new String(chars);
    }

    public void swap(char[] array, int l, int r){

        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }

    }


    public String reverseLeftWordsOld(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

}
