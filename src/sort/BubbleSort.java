package sort;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/7/31 23:42
 *
 * @author MoQuan
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] ints = {3, 4, 6, 213, 6, 34, 6, 342, 1, 5, 654, 7, 45, 74, 57, 44, 345, 234, 63, 4364};
        bubbleAZ(ints);
        System.out.println(Arrays.toString(ints));

    }

    public static void bubbleAZ(int[] arr) {

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }

        }

    }

    public static void bubbleAZ00(int[] arr) {

        int len = arr.length;
        boolean swap = false;
        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }

            }

            if (!swap) {
                break;
            }

        }

    }

}
