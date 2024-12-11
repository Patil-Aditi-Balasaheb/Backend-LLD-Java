package lecture_assignments.concurrency2_executors_and_callables.threads_with_callables_2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Assuming Node is a class with left, right, and data properties
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Create and submit the task to calculate the tree size
        TreeSizeCalculator calculator = new TreeSizeCalculator(root, executorService);
        Future<Integer> future = executorService.submit(calculator);

        // Wait for the result and print the tree size
        System.out.println("Tree size: " + future.get());

        // Shutdown the executor service after all tasks are completed
        executorService.shutdown();
    }
}