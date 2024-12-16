package lecture.concurrency4_synchronization_with_semaphores.semaphores;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Semaphore cs = new Semaphore(0);
        Semaphore ps = new Semaphore(5);

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Consumer(store, cs, ps));
            t.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Producer(store, cs, ps));
            t.start();
        }
    }
}
