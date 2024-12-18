package lecture_assignments.oop3_inheritance_and_polymorphism.scaler_learning_platform;

public class Student extends User {
    private int studentId;
    private String course;

    public Student(String username, String email, int studentId, String course) {
        super(username, email);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }

    public static void main(String[] args) {
        Student student = new Student("jane_doe", "jane.doe@example.com", 101, "Computer Science");
        System.out.println("Username: " + student.getUsername());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Course: " + student.getCourse());
        student.displayInfo();
    }
}
