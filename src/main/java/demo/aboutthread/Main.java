package demo.aboutthread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.extern.slf4j.Slf4j;

// @Slf4j
public class Main {

    private static AtomicInteger atomicInt = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        // doFuture();

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);

        HashMap<String, Object> map = new HashMap<>();

        map.put(null, new Object());
        Hashtable<String, Object> map2 = new Hashtable<>();

        map2.put(null, new Object());
    }

    private static void doFuture() throws Exception {

        final CompletableFuture<String> future = new CompletableFuture<>();

        CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000);
                future.complete(String.valueOf(atomicInt.incrementAndGet()));
            } catch (InterruptedException e) {
                // log.error(e);
            }
        }).get();

        boolean flag = false;
        while (!flag) {
            flag = future.isDone();
            // log.info("Current state -> [{}]", flag);
            Thread.sleep(5000);
        }
    }

}
