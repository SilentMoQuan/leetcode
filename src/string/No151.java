package string;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/21 11:14 </b><br />
 */
public class No151 {

    public static void main(String[] args) {

    }

    public String reverseWords(String s) {

        StringBuilder builder = new StringBuilder();
        String[] split = s.split(" ");

        int length = split.length;
        for (int i = 0; i < length; i++){
            if(!"".equals(split[length - 1 - i])){
                if(i != 0){
                    builder.append(" ");
                }
                builder.append(split[length - 1 - i]);
            }
        }

        return builder.toString();
    }

    public String reverseWordsOld(String s) {

        StringBuilder builder = new StringBuilder();
        String[] split = s.split(" ");

        int length = split.length;
        for (int i = 0; i < length; i++){
            if(!"".equals(split[length - 1 - i])){
                if(i != 0){
                    builder.append(" ");
                }
                builder.append(split[length - 1 - i]);
            }
        }

        return builder.toString();
    }

}
