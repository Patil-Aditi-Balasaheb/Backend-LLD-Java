package lecture.concurrency3_introduction_to_synchronization.synchronization_problem;

public class Adder implements Runnable {
    public Counter counter;

    public Adder(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            counter.i -= i;
        }
    }
}
