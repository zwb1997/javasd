package demo.lists;

import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TryCopyOnWrite {

    private static volatile int count;

    private static AtomicInteger coutInteger = new AtomicInteger(0);

    private static AtomicInteger sumInteger = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        CountDownLatch latch = new CountDownLatch(10);
        Random random = new Random();
        new Thread(() -> {
            while (latch.getCount() > 0) {
                try {

                    for (int i = 0; i < 10; i++) {
                        int val = random.nextInt(1000);
                        log.info("thread -> [{}], add a number", Thread.currentThread().getName());
                        list.add(val);
                        coutInteger.getAndIncrement();
                        Thread.sleep(1500);
                    }
                    latch.countDown();
                } catch (InterruptedException e) {
                    log.error("add string failed", e);
                }
            }
        }).start();

        new Thread(() -> {

            while (latch.getCount() != 0) {
                try {

                    log.info("thread -> [{}], read list", Thread.currentThread().getName());
                    ListIterator<Integer> itr = list.listIterator();
                    log.info("thread -> [{}] try to read list", Thread.currentThread().getName());
                    while (itr.hasNext()) {
                        log.info("thread -> [{}] , value -> [{}]", Thread.currentThread().getName(), itr.next());
                        sumInteger.getAndIncrement();
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    log.error("add string failed", e);
                }
            }
        }).start();

        latch.await();

        log.info("after add all elements and read, cout is -> [{}], sum is -> [{}]", coutInteger.get(),
                sumInteger.get());
    }
}
