package lecture_assignments.oop3_inheritance_and_polymorphism.scaler_learning_platform;

public class Employee extends User {
    private int employeeId;
    private String department;

    public Employee(String username, String email, int employeeId, String department) {
        super(username, email);
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("john_smith", "john.smith@example.com", 201, "Human Resources");
        System.out.println("Username: " + employee.getUsername());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Department: " + employee.getDepartment());
        employee.displayInfo();
    }
}
