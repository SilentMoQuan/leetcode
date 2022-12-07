package backtracking;

import java.util.*;

/**
 * describe
 * <p>
 * 2022/12/7 22:12
 *
 * @author MoQuan
 */
public class No332 {

    int[] useArr = null;
    LinkedList<String> list = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        useArr = new int[tickets.size()];

        tickets.sort(Comparator.comparing(a -> a.get(1)));

        list.add("JFK");
        backtracking(tickets, "JFK");

        return new ArrayList<>(list);
    }

    private boolean backtracking(List<List<String>> tickets, String cur) {

        if(tickets.size() + 1 == list.size()) {
            return true;
        }

        for (int i = 0; i < tickets.size(); i++){
            List<String> fromTo = tickets.get(i);
            if(cur.equals(fromTo.get(0)) && useArr[i] != 1){
                String to = fromTo.get(1);
                useArr[i] = 1;
                list.add(to);
                if (backtracking(tickets, to)) {
                    return true;
                }
                list.removeLast();
                useArr[i] = 0;
            }
        }

        return false;
    }

}
