package lecture.concurrency4_synchronization_with_semaphores.semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {

    Queue<Object> queue;

    public Store() {
        // Thread safe version of queue
        this.queue = new ConcurrentLinkedQueue<>();
    }
}
