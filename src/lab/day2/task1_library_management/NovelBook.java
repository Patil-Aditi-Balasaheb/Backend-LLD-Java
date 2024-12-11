package lab.day2.task1_library_management;

public class NovelBook extends Book {
    private String genre;

    NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    void displayBookDetails() {
        System.out.println("Novel Book Details:");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + genre);
    }
}
