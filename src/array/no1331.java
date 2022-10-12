package java.array;

import java.util.*;

/**
 * describe
 * <p>
 * 2022/7/28 0:31
 *
 * @author MoQuan
 */
public class no1331 {

    public static void main(String[] args) {



    }

    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        int[] temp = new int[set.size()];
        int size = 0;

        for (Integer integer : set) {
            temp[size++] = integer;
        }

        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();

        size = 0;
        for (int i : temp) {
            map.put(temp[size], size);
            size++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

}
