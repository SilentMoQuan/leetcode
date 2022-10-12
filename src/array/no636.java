package java.array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/**
 * describe
 * <p>
 * 2022/8/7 10:24
 *
 * @author MoQuan
 */
public class no636 {

    static String START = "start";
    static String END = "end";

    public static void main(String[] args) {
        List<String> list = Arrays.asList("0:start:0", "1:start:5", "2:start:6", "3:start:9", "4:start:11", "5:start:12", "6:start:14", "7:start:15", "1:start:24", "1:end:29", "7:end:34", "6:end:37", "5:end:39", "4:end:40", "3:end:45", "0:start:49", "0:end:54", "5:start:55", "5:end:59", "4:start:63", "4:end:66", "2:start:69", "2:end:70", "2:start:74", "6:start:78", "0:start:79", "0:end:80", "6:end:85", "1:start:89", "1:end:93", "2:end:96", "2:end:100", "1:end:102", "2:start:105", "2:end:109", "0:end:114");

//        List<String> list = Arrays.asList(
//                "0:start:0",
//                    "1:start:5",
//                        "2:start:6",
//                            "3:start:9",
//                                "4:start:11",
//                                    "5:start:12",
//                                        "6:start:14",
//                                            "7:start:15",
//                                                "1:start:24",
//                                                "1:end:29",
//                                            "7:end:34",
//                                        "6:end:37",
//                                    "5:end:39",
//                                "4:end:40",
//                            "3:end:45", // 14
//                            "0:start:49", // 15
//                            "0:end:54", // 16
//                            "5:start:55", // 17
//                            "5:end:59", // 18
//                            "4:start:63", // 19
//                            "4:end:66", // 20
//                            "2:start:69", // 21
//                            "2:end:70", // 22
//                            "2:start:74", // 23
//                                "6:start:78",
//                                    "0:start:79",
//                                    "0:end:80",
//                                "6:end:85", // 27
//                                "1:start:89", // 28
//                                "1:end:93",
//                            "2:end:96",
//                        "2:end:100",
//                    "1:end:102", // 32
//                    "2:start:105", // 33
//                    "2:end:109",
//                "0:end:114");
//        List<String> list = Arrays.asList("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7");
//        List<String> list = Arrays.asList("0:start:0","1:start:2","1:end:5","0:end:6");
//        List<String> list = Arrays.asList("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
//        List<String> list = Arrays.asList("0:start:0","0:start:2","0:end:5","1:start:7","1:end:7","0:end:8");
//        List<String> list = Arrays.asList("0:start:0","0:end:0","1:start:1","1:end:1","2:start:2","2:end:2","2:start:3","2:end:3");

        System.out.println(Arrays.toString(exclusiveTime(8, list)));
    }

    public static int[] exclusiveTime(int n, List<String> logs) {

        int[] ans = new int[n];

        ArrayDeque<int[]> stack = new ArrayDeque<>();

        for (String log : logs) {

            String[] split = log.split(":");

            int id = Integer.parseInt(split[0]);
            String type = split[1];
            int timestamp = Integer.parseInt(split[2]);

            if ("start".equals(type)) {
                if (!stack.isEmpty()) {
                    ans[stack.peek()[0]] += timestamp - stack.peek()[1];
                    stack.peek()[1] = timestamp;
                }
                stack.push(new int[]{id, timestamp});
            } else {
                int[] start = stack.pop();
                ans[id] += timestamp - start[1] + 1;
                if(!stack.isEmpty()){
                    stack.peek()[1] = timestamp + 1;
                }
            }

        }

        return ans;
    }

    private static void old(List<String> logs, int[] ans) {
        int beforeTime = 0;
        // start true , end false;
        String beforeStatus = "";
        int beforeMethod = 0;

        String[] split = logs.get(0).split(":");

        beforeMethod = Integer.parseInt(split[0]);
        beforeStatus = split[1];
        beforeTime = Integer.parseInt(split[2]);

        for (int i = 1; i < logs.size(); i++) {

            split = logs.get(i).split(":");

            if (beforeStatus.equals(START) && split[1].equals(START)) {
                ans[beforeMethod] += Integer.parseInt(split[2]) - beforeTime;
            } else if (beforeStatus.equals(END) && split[1].equals(END)) {
                ans[Integer.parseInt(split[0])] += Integer.parseInt(split[2]) - beforeTime;
            } else if (beforeStatus.equals(START) && split[1].equals(END)) {
                ans[beforeMethod] += Integer.parseInt(split[2]) - beforeTime + 1;
            } else if (beforeStatus.equals(END) && split[1].equals(START)) {
                if (Integer.parseInt(split[2]) - beforeTime - 1 != 0 && outMethod(logs, i - 1) != -1) {
                    ans[outMethod(logs, i - 1)] += Integer.parseInt(split[2]) - beforeTime - 1;
                }
            }

            beforeMethod = Integer.parseInt(split[0]);
            beforeStatus = split[1];
            beforeTime = Integer.parseInt(split[2]);
        }
    }

    public static int outMethod(List<String> logs, int now) {

        int target = 0;

        for (int i = now; i >= 0; i--) {

            String[] split = logs.get(i).split(":");

            if (split[1].equals(END)) {
                target--;
            } else {
                target++;
            }

            if (target == 1) {
                return Integer.parseInt(split[0]);
            }

        }

        return -1;
    }
}
