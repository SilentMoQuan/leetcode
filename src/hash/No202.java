package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/20 9:13 </b><br />
 */
public class No202 {
    public static void main(String[] args) {

        System.out.println(isHappyNumber(
                19));

    }

    public static int getNum(int num){

        int sum = 0;

        while(num != 0){

            sum += (num % 10) * (num % 10);
            num /= 10;

        }
        System.out.println(sum);
        return sum;
    }

    public static boolean isHappyNumber(int n){

        Map<Integer, Object> map = new HashMap<>();
        int sum = getNum(n);

        while (sum != 1){

            if(map.getOrDefault(sum, null) == null){
                map.put(sum, new Object());
            }else{
                return false;
            }

            sum = getNum(sum);
        }

        return true;
    }

}
