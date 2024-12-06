package day2.task1_library_management;

public class Member extends User {
    private int borrowedBooksCount;
    private static int MAX_BORROW_LIMIT = 5;

    @Override
    public void displayDashboard() {
        System.out.println("MEMBER DASHBOARD");
        System.out.println(getName() + " borrowed books count: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
