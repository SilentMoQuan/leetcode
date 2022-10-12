package java.sort;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/8/2 0:20
 *
 * @author MoQuan
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] ints = {3, 4, 6, 213, 6, 34, 6, 342, 1, 5, 654, 7, 45, 74, 57, 44, 345, 234, 63, 4364};
        shellAZ(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void shellAZ(int[] arr) {

        int length = arr.length;
        int temp;

        for (int step = length / 2; step >= 1 ; step /= 2) {

            for (int i = step; i < length; i++) {

                temp = arr[i];
                int j = i - step;

                while (j > -1 && temp < arr[j]){
                    arr[j + step] = arr[j];
                    j -= step;
                }

                arr[j + step] = temp;
            }

        }

    }

    private static void shellDemo(int[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }

}
