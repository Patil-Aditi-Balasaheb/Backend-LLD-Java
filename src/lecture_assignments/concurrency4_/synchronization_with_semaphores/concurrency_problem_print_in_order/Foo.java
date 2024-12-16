package lecture_assignments.concurrency4_.synchronization_with_semaphores.concurrency_problem_print_in_order;

import java.util.concurrent.Semaphore;

public class Foo {

    Semaphore fs;
    Semaphore ss;
    Semaphore ts;

    public Foo() {
        this.fs = new Semaphore(1);
        this.ss = new Semaphore(0);
        this.ts = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        // acquire first
        fs.acquire();

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();

        // release second
        ss.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // acquire second
        ss.acquire();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();

        // release third
        ts.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // acquire third
        ts.acquire();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}