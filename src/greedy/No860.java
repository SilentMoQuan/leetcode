package greedy;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/21 14:42 </b><br />
 */
public class No860 {


    public boolean lemonadeChange(int[] bills) {

        if (bills[0] != 5) {
            return false;
        }

        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {

            switch (bills[i]) {
                case 5: {
                    five++;
                    break;
                }
                case 10: {

                    if (five < 1) {
                        return false;
                    }
                    five--;
                    ten++;
                    break;
                }
                case 20: {

                    if (ten > 0 && five > 0) {
                        five--;
                        ten--;
                        break;
                    }

                    if (five >= 3) {
                        five -= 3;
                        break;
                    }

                    return false;
                }
                default:
            }

        }

        return true;
    }


}
