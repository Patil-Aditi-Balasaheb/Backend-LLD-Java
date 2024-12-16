package lecture.concurrency3_introduction_to_synchronization.synchronized_code;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.i);
    }
}
