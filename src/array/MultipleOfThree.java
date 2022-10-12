package java.array;

import java.util.Scanner;

/**
 * describe
 * <p>
 * 2022/7/28 14:33
 *
 * @author MoQuan
 */
public class MultipleOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ) {
            arr[i++] = i;
        }

        int step = 1;
        int size = n;
        int i = 0;

        while (true) {

            // 最后结果
            if (size == 1) {
                break;
            }
            // 跳过空值
            if (arr[i] != 0) {
                if (step % 3 == 0) {
                    arr[i] = 0;
                    size--;
                }
                step++;
            }
            i++;

            // 重置指针
            if (i >= n) {
                i = 0;
            }
        }

        for (int j = 0; j < n; j++) {
            if(arr[j] != 0){
                System.out.println(arr[j]);
                break;
            }
        }

    }


}
