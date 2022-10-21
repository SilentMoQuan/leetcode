package string;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/21 11:04 </b><br />
 */
public class JianZhi05 {

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(' ' == c){
                builder.append("%20");
            }else{
                builder.append(c);
            }
        }
        return builder.toString();
    }

}
