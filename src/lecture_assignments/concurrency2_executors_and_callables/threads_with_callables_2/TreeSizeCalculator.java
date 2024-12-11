package lecture_assignments.concurrency2_executors_and_callables.threads_with_callables_2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    public Node root;
    public ExecutorService executorService;

    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService = executorService;
    }

    @Override
    public Integer call() throws Exception {
        if (root == null) {
            return 0;
        }

        // process left and right subtree in parallel
        TreeSizeCalculator left = new TreeSizeCalculator(root.left, executorService);
        TreeSizeCalculator right = new TreeSizeCalculator(root.right, executorService);

        // submit tasks for left and right subtrees
        Future<Integer> leftResult = executorService.submit(left);
        Future<Integer> rightResult = executorService.submit(right);

        // return total size = left subtree size + right subtree size + 1 (for root)
        return leftResult.get() + rightResult.get() + 1;
    }
}
