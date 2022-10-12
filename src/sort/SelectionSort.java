package java.sort;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/7/31 23:52
 *
 * @author MoQuan
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] ints = {3, 4, 6, 213, 6, 34, 6, 342, 1, 5, 654, 7, 45, 74, 57, 44, 345, 234, 63, 4364};
        selectionAZ(ints);
        System.out.println(Arrays.toString(ints));

    }

    public static void selectionAZ(int[] arr) {

        int length = arr.length;

        int minIndex = 0;
        for (int i = 0; i < length; i++) {

            minIndex = i;
            for (int j = i; j < length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }

    }
}
