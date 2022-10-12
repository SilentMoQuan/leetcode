package java.array;

import java.util.ArrayList;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/7/30 9:04
 *
 * @author MoQuan
 */
public class no952 {

    public static void main(String[] args) {

        int a = 11, b = 41;
        int c;
        int i = 0;
        while (a != b) {

            while (a % 2 == 0 && b % 2 == 0) {
                a /= 2;
                b /= 2;
                i++;
            }

            if (a > b) {
                c = a - b;
            } else {
                c = b - a;
            }

            a = b;
            b = c;

            System.out.println(a * Math.pow((double) 2, (double) i));


        }
    }

    public int largestComponentSize(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {


            }

        }

        return 0;
    }

    private class Node {

        public int value;

        public List<Node> nList = new ArrayList<>();

    }

}
