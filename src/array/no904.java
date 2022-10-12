package java.array;

import java.util.HashSet;

/**
 * describe
 * <p>
 * 2022/6/21 22:09
 *
 * @author MoQuan
 */
public class no904 {

    public static void main(String[] args) {
        int[] fruits = new int[]{3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(fruits));
    }

    public static int totalFruit(int[] fruits) {
        // 保存最大结果
        int answer = 0;
        // 每次切换时的指针
        int swap = 0;
        // 窗口的开始与结束
        int start = 0, end = 0;
        // 篮子
        HashSet<Integer> basket = new HashSet<>();
        // 边界
        while (end < fruits.length) {
            // 将当前果子种类放入篮子
            basket.add(fruits[end]);
            // 出现 3 种时超出存放上限
            if (basket.size() == 3) {
                // 保存结果
                answer = Math.max(end - start, answer);
                // 清空篮子
                basket.clear();
                // 将最后一次切换后的水果种类放入篮子
                basket.add(fruits[swap]);
                // 将当前水果种类放入篮子
                basket.add(fruits[end]);
                // 移动开始窗口
                start = swap;
            }

            // 记录篮子中水果切换时的位置
            if (fruits[swap] != fruits[end]) {
                swap = end;
            }

            end++;
        }

        return Math.max(end - start, answer);
    }

}
