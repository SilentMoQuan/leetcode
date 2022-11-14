package sort;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/8/1 0:18
 *
 * @author MoQuan
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] ints = {3, 4, 6, 213, 6, 34, 6, 342, 1, 5, 654, 7, 45, 74, 57, 44, 345, 234, 63, 4364};
        insertionSortAZ(ints);
        System.out.println(Arrays.toString(ints));

    }

    public static void insertionSortAZ(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int j = i;
            int temp = arr[j];

            while (j > 0 && temp < arr[j - 1]){
                arr[j] = arr[j - 1];
                j--;
            }

            if(j != i){
                arr[j] = temp;
            }

        }

    }

    public static void insertionSortAZ04(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int j = i;
            int temp = arr[i];

            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            if (j != i) {
                arr[j] = temp;
            }

        }

    }

    private static void insertionSortAZ03(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int j = i;
            int temp = arr[j];

            while (j > 0 && arr[j - 1] < temp) {
                arr[j] = arr[j - 1];
                j--;
            }

            if (i != j) {
                arr[j] = temp;
            }

        }
    }

    private static void insertionSortAZ02(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int j = i;

            int temp = arr[j];

            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            if (j != i) {
                arr[j] = temp;
            }

        }
    }

    private static void insertionSortAZ01(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];

            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            if (j != i) {
                arr[j] = temp;
            }

        }
    }

}
