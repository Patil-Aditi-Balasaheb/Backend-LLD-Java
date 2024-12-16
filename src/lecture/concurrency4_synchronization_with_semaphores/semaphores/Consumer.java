package lecture.concurrency4_synchronization_with_semaphores.semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Store store;
    Semaphore cs;
    Semaphore ps;

    public Consumer(Store store, Semaphore cs, Semaphore ps) {
        this.store = store;
        this.cs = cs;
        this.ps = ps;
    }

    @Override
    public void run() {
        try {
            cs.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Consumer " + Thread.currentThread().getName() + " got called. Size of queue " + store.queue.size());

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        store.queue.poll();
        ps.release();
    }
}
