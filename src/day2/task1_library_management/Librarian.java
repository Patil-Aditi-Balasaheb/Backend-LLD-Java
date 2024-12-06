package day2.task1_library_management;

public class Librarian extends User {
    private String employeeNumber;

    Librarian() {
        super();
    }

    Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("LIBRARIAN DASHBOARD");
        System.out.println("Name: " + getName());
        System.out.println("Employee Number: " + employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {
    }

    void removeBook(Book book) {
    }
}
