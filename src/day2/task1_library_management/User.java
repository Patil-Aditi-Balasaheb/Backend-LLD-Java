package day2.task1_library_management;

abstract class User {
    private String userId;
    private String name;
    private String contactInfo;


    User() {
        this.userId = generateUniqueId();
    }

    User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    User(User user) {
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    String getUserId() {
        return this.userId;
    }

    String getName() {
        return this.name;
    }

    String getContactInfo() {
        return this.contactInfo;
    }

    String generateUniqueId() {
        return "r4323";
    }

    abstract void displayDashboard();

    abstract boolean canBorrowBooks();
}
