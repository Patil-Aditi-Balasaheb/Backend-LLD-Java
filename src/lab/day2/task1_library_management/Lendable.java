package lab.day2.task1_library_management;

public interface Lendable {
    boolean lend(User user);

    void returnBook(User user);

    boolean isAvailable();
}
