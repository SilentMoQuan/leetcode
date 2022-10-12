package java.array;

import java.util.Arrays;

public class no88main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;

        if (m == 0)
            while (end >= 0) {
                nums1[end] = nums2[j];
                end--;
                j--;
            }
        else if (n != 0)
            while (i >= 0 && j >= 0) {

                if (nums1[i] >= nums2[j]) {
                    nums1[end] = nums1[i];
                    i--;
                } else {
                    nums1[end] = nums2[j];
                    j--;
                }
                end--;

            }

        while (j >= 0){
            nums1[end] = nums2[j];
            j--;
            end--;
        }

        return nums1;
    }
}
