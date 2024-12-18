package lecture_assignments.oop3_inheritance_and_polymorphism.scaler_learning_platform;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        User user = new User("john_doe", "john.doe@example.com");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        user.displayInfo();
    }
}
