package java.array;

/**
 * describe
 * <p>
 * 2022/6/20 18:07
 *
 * @author MoQuan
 */
public class no367 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(100));
    }

    public static boolean isPerfectSquare(int num) {

        int left = 0;
        int right = num;

        int mid = 0;
        long multi = -1;

        while (left <= right) {

            mid = (left + right) / 2;
            multi = (long) mid * (long) mid;

            if (multi == num) {
                return true;
            } else if (multi > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return false;
    }

}
