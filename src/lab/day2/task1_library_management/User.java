package lab.day2.task1_library_management;

public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    User() {
        this.userId = generateUniqueId();
    }

    User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User user) {
        this.userId = generateUniqueId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    private final String generateUniqueId() {
        totalUsers++;
        return "User-" + totalUsers;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

    public abstract void returnBook();
}
