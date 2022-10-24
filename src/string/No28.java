package string;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/22 13:08 </b><br />
 */
public class No28 {

    public static void main(String[] args) {
        System.out.println(strStr("ababaabbbbababbaabaaabaabbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbbaabbbabbbaabbbbaaabbababbabbbabaaabbaabbabababbbaaaaaaababbabaababaabbbbaaabbbabb",
                "abbabbbabaa"));
    }

    public static int[] getNextArr(char[] arr){

        int[] next = new int[arr.length];

        next[0] = 0;
        int j = 0;

        for (int i = 1 ; i < arr.length; i++){

            while (j > 0 && arr[j] != arr[i]){
                j = next[j - 1];
            }

            if(arr[j] == arr[i]){
                j++;
            }

            next[i] = j;
        }

        return next;
    }

    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0){
            return 0;
        }

        int[] nextArr = getNextArr(needle.toCharArray());

        int i = 0, j = 0;

        while (i < haystack.length()){

            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = nextArr[j - 1];
            }

            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }

            if(j == needle.length()){
                return i - needle.length() + 1;
            }


            i++;
        }

        return -1;
    }
}
