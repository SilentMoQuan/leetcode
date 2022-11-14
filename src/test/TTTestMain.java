package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * describe
 * <p>
 * 2022/11/14 21:51
 *
 * @author MoQuan
 */
public class TTTestMain {

    public static void main(String[] args) {

        ArrayList<Mon> mons = new ArrayList<>();

        List<HashMap<Long, Integer>> list = mons.stream()
                .map(Mon::getIds)
                .map(id -> CompletableFuture.supplyAsync(() -> {

                    // ye wu
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    HashMap<Long, Integer> result = new HashMap<>();

                    // fanhui
                    return result;
                }))
                .collect(Collectors.toList())
                .stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

    }


}

class Mon {

    long ids;

    public long getIds() {
        return ids;
    }

    public Mon setIds(long ids) {
        this.ids = ids;
        return this;
    }
}


