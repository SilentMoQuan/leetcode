package java.array;

/**
 * describe
 * <p>
 * 2022/6/20 11:33
 *
 * @author MoQuan
 */
public class no69 {

    public static void main(String[] args) {
        System.out.println(mySqrt(103));
    }

    public static int mySqrtOld(int x) {

        long answer = 0;
        int step = 0;

        while (answer <= x) {

            step = 1;

            while (true) {

                if ((answer + step) * (answer + step) < x) {
                    answer += step;
                    step++;
                } else if ((answer + step) * (answer + step) == x) {
                    return (int) answer + step;
                } else {
                    break;
                }

            }

            if (step == 1) {
                break;
            }

        }

        return (int) answer;
    }

    public static int mySqrt(int x) {

        int answer = 0;
        int left = 0;
        int right = x;

        int mid = 0;
        long multi = 0;

        while (left <= right) {

            mid = (left + right) / 2;

            multi = (long) mid * (long) mid;
            if (multi == x) {
                return mid;
            } else if (multi > x) {
                right = mid - 1;
            } else {
                answer = mid;
                left = mid + 1;
            }

        }

        return answer;
    }

}
