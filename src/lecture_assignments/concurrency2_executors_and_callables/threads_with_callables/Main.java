package lecture_assignments.concurrency2_executors_and_callables.threads_with_callables;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // create a fixed thread pool with a single thread
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        // submit the task to the executor and get a future object
        Future<List<Integer>> future = executorService.submit(new ArrayCreator(n));

        // printing the generated list
        System.out.println(future.get());

        // shutdown the executor service
        executorService.shutdown();

        // close the scanner object
        scanner.close();
    }
}
