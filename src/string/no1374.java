package java.string;

/**
 * describe
 * <p>
 * 2022/8/1 9:22
 *
 * @author MoQuan
 */
public class no1374 {

    public static void main(String[] args) {

    }

    public static String generateTheString(int n) {

        char[] ans = new char[n];

        if(n < 3){
            switch (n){
                case 0:
                    return "";
                case 1:
                    return "x";
                case 2:
                    return "xy";
                default:
            }
        }

        if (n % 2 == 0) {

            for (int i = 0; i < n - 1; i++) {
                ans[i] = 'x';
            }
            ans[n-1] = 'y';

        } else {

            for (int i = 0; i < n; i++) {
                ans[i] = 'x';
            }

        }

        return new String(ans);
    }
    public static String generateTheStringOld(int n) {

        StringBuilder builder = new StringBuilder();

        if(n < 3){
            switch (n){
                case 0:
                    return "";
                case 1:
                    return "x";
                case 2:
                    return "xy";
                default:
            }
        }

        if (n % 2 == 0) {

            for (int i = 0; i < n - 1; i++) {
                builder.append("x");
            }
            builder.append("y");

        } else {

            for (int i = 0; i < n; i++) {
                builder.append("x");
            }

        }


        return builder.toString();
    }
}
