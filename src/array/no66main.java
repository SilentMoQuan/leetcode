package java.array;

import java.util.Arrays;

public class no66main {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));

    }


    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;

            if (digits[i] != 0) return digits;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }

    public static int[] plusOneOld(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = 0;
//                digits[i - 1] += 1;
            } else {
                digits[i] += 1;
                break;
            }
        }

        if (digits[0] == 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }

        return digits;
    }
}


