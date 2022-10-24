package doublepointer;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/24 17:22 </b><br />
 */
public class No844 {

    public static void main(String[] args) {

        System.out.println(backspaceCompare("a#c###",
                "ad#c"));

    }

    public static boolean backspaceCompare(String s, String t) {

        int sLen = s.length() - 1;
        int tLen = t.length() - 1;

        int count = 0;

        while (sLen >= 0 || tLen >= 0){

            count = 0;
            while (sLen >= 0 && (s.charAt(sLen) == '#' || count > 0)){
                if(s.charAt(sLen) == '#'){
                    count++;
                }else{
                    count--;
                }
                sLen--;
            }

            count = 0;
            while (tLen >= 0 &&  (t.charAt(tLen) == '#' || count > 0)){
                if(t.charAt(tLen) == '#'){
                    count++;
                }else{
                    count--;
                }
                tLen--;
            }

            char sC = sLen < 0 ? 'A' : s.charAt(sLen);
            char tC = tLen < 0 ? 'A' : t.charAt(tLen);

            if(sC != tC){
                return false;
            }

            sLen--;
            tLen--;

        }

        return true;
    }

}
