package lecture.design_patterns_builder.builder;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.setId(1L);
        helper.setName("Aditi");
        helper.setBatch("April2023");
        helper.setPsp(92.29);
        helper.setUniversity("MU");

        Student student = new Student(helper);
        student.changeBatch("Dec2023");
    }
}
