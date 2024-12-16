package lecture_assignments.concurrency3_introduction_to_synchronization.mutex;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(10);

        counter.incValue(5);
        System.out.println("Counter after incrementing: " + counter.getValue());

        counter.decValue(3);
        System.out.println("Counter after decrementing: " + counter.getValue());

        System.out.println("Current Counter value: " + counter.getValue());
    }
}
