package lab.day2.task1_library_management;

public class Member extends User {
    private int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;

    Member() {
        super();
        borrowedBooksCount = 0;
    }

    Member(String name, String contactInfo) {
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("MEMBER DASHBOARD");
        System.out.println("Name: " + getName());
        System.out.println(getName() + " borrowed books count: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBook() {
        borrowedBooksCount--;
    }
}
