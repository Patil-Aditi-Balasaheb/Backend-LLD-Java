package lecture_assignments.concurrency2_executors_and_callables.threads_with_callables_2;

public class Node {
    public Node left;
    public Node right;
    public int data;

    public Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
