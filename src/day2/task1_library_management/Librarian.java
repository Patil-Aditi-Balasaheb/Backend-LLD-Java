package day2.task1_library_management;

import java.awt.print.Book;

public class Librarian extends User {
    private String employeeNumber;

    @Override
    public void displayDashboard() {
        System.out.println("LIBRARIAN DASHBOARD");
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
