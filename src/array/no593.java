package java.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * describe
 * <p>
 * 2022/7/29 9:06
 *
 * @author MoQuan
 */
public class no593 {

    public static void main(String[] args) {

        int[] p1 = {2, 1};
        int[] p2 = {1, 2};
        int[] p3 = {0, 0};
        int[] p4 = {2, 0};

        System.out.println(validSquare(p1, p2, p3, p4));

    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
            HashSet<Integer> set = new HashSet<>();
            //存放点和点之间的距离
            set.add(distance(p1, p2));
            set.add(distance(p1, p3));
            set.add(distance(p1, p4));
            set.add(distance(p2, p3));
            set.add(distance(p2, p4));
            set.add(distance(p3, p4));
            //只有两种结果 并且距离不是0
            if (set.size() != 2 || set.contains(0)) {
                return false;
            }
            //是不是根号2倍 平方就是2倍
            Integer[] array = set.toArray(new Integer[2]);
            if (array[0] > array[1]) {
                return array[0] == 2 * array[1];
            } else {
                return array[1] == 2 * array[0];
            }
        }

        public static int distance(int[] p1, int[] p2) {
            int edge1 = p1[0] - p2[0];
            int edge2 = p1[1] - p2[1];
            return edge1 * edge1 + edge2 * edge2;
        }

}
