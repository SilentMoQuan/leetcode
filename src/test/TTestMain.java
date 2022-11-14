package test;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * describe
 * <p>
 * 2022/11/14 20:38
 *
 * @author MoQuan
 */
public class TTestMain {

    public static void main(String[] args) throws IOException {

        CompletableFuture<String> future01 = CompletableFuture.supplyAsync(() -> {
            try {

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return "111";

            } catch (Exception e) {

            }
            return "000";
        });

        CompletableFuture<String> future04 = CompletableFuture.supplyAsync(() -> {
            try {

                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return "444";

            } catch (Exception e) {

            }
            return "....";
        });

        CompletableFuture.anyOf(future01, future04).whenComplete((str, e) -> {
            if(null != e){
                e.printStackTrace();
            }else {
                System.out.println(str);
            }
        });

        System.in.read();

    }



}
