package lab.task1_library_management;

public class TextBook extends Book {
    String subject;
    int edition;

    TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    void displayBookDetails() {
        System.out.println("Textbook's details");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }
}
