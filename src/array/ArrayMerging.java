package java.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerging {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] a = new int[m];
        int[] b = new int[n];

        for (int i = 0; i < m; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int[] ans = new int[m + n];

        // a
        int p = 0;
        // b
        int q = 0;

        for (int i = 0; i < m + n; i++) {
            if (p >= m) {
                while (q < n) {
                    ans[i++] = b[q++];
                }
                break;
            } else if (q >= n) {
                while (p < m) {
                    ans[i++] = a[p++];
                }
                break;
            } else if (a[p] <= b[q]) {
                ans[i] = a[p++];
            }else{
                ans[i] = b[q++];
            }
        }

        System.out.println(Arrays.toString(ans));
    }

}
