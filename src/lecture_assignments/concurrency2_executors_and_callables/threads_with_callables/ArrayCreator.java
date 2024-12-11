package lecture_assignments.concurrency2_executors_and_callables.threads_with_callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    public int n;

    ArrayCreator(int n) {
        this.n = n;
    }

    // call method which generates a list of numbers from 1 to n
    @Override
    public List<Integer> call() throws Exception {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= this.n; i++) {
            result.add(i);
        }
        return result;
    }
}
