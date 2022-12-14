package greedy;

import java.util.Arrays;

/**
 * describe
 * <p>
 * 2022/12/14 22:20
 *
 * @author MoQuan
 */
public class No134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int startIndex = 0;
        int allResult = 0;
        int allGas = 0;
        int allCost = 0;
        for (int i = 0; i < gas.length; i++) {

            allCost += cost[i];
            allGas += gas[i];
            allResult += (gas[i] - cost[i]);
            if (allResult < 0) {
                allResult = 0;
                startIndex = (i + 1) % gas.length;
            }

        }

        if (allCost > allGas) {
            return -1;
        } else {
            return startIndex;
        }
    }

}
