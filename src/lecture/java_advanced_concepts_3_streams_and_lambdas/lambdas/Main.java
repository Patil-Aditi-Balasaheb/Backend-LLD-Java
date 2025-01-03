package lecture.java_advanced_concepts_3_streams_and_lambdas.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorld = new HelloWorldPrinter();
        Thread t1 = new Thread(helloWorld);
        t1.start();

        // Anonymous class object -> class has no name
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World in anonymous thread " + Thread.currentThread().getName());
            }
        });
        t2.start();

        // Anonymous
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World in anonymous thread " + Thread.currentThread().getName());
            }
        };
        Thread t3 = new Thread(r1);
        t3.start();

        // Anonymous
        Thread t4 = new Thread(() -> System.out.println("Hello World in anonymous thread " + Thread.currentThread().getName()));
        t4.start();

        // Lambda
        NumberPrinter numberPrinter = (a) -> System.out.println(a + 1);
        numberPrinter.printNumber(5);

        // Functional Interface
        Consumer<Integer> consumer = (a) -> System.out.println(a + 10);
        consumer.accept(10);

        Function<Integer, String> function = (a) -> {
            return a.toString();
        };
        System.out.println(function.apply(50));

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 20);

        Supplier<String> helloWorldSupplier = () -> "Hello World Supplier";
        System.out.println(helloWorldSupplier.get());

        List<Integer> integers = List.of(1, 2, 3);
        // way 1
        Consumer<Integer> integerConsumer = (a) -> System.out.println(a);
        integers.forEach(integerConsumer);

        // way 2
        integers.forEach(a -> System.out.println(a));

        // way 3
        integers.forEach(System.out::println);

        integers.forEach(a -> {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        });
    }
}
