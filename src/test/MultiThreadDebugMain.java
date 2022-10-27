package test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/10/27 9:21 </b><br />
 */
public class MultiThreadDebugMain {
    HashMap<Object, Object> threadHolder = new HashMap<>();
    volatile String flag = "";
    final static String ALL_STOP_FLAG = "ALL_STOP";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ReentrantLock lock = new ReentrantLock(false);

        while (true) {

            String command = sc.next();

            System.out.println("=========== menu ===========");
            System.out.println("    0 : show all threads    ");
            System.out.println("    1 : start new thread    ");
            System.out.println("    2 : stop one thread     ");
            System.out.println("    3 : stop all threads    ");
            System.out.println("    4 : break loop          ");
            System.out.println("============================");

        }

    }

    private void startThread(String threadName, Lock lock) {

        Thread thread = new Thread(() -> {

            lock.lock();

            try {
                while (!ALL_STOP_FLAG.equals(flag) && !threadName.equals(flag)) {
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(threadName);
                }
            } catch (InterruptedException e) {
            } finally {
                lock.unlock();
            }

            System.out.println("[ " + threadName + " ] break ");
        }, threadName);
        threadHolder.put(threadName, thread);
        thread.start();

    }
}
