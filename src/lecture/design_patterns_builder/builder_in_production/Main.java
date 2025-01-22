package lecture.design_patterns_builder.builder_in_production;

public class Main {
    public static void main(String[] args) {
        /*
        // Student class responsible for providing its own builder
        // Creating a builder object
        Student.Builder helper = new Student.Builder();
        helper.setId(1L);
        helper.setName("Aarti");
        helper.setBatch("March2024");
        helper.setPsp(85.56);
        helper.setUniversity("IIT");

        // Builder responsibility to build the Student object
        Student student = new Student(helper);
        student.changeBatch("Aug2024");
        */

        /*
        Student.Builder helper = Student.newBuilder();
        helper.setId(1L);
        helper.setName("Jatin");
        helper.setBatch("March2024");
        helper.setPsp(85.56);
        helper.setUniversity("IIT");

        Student student = helper.build();
        */

        Student student = Student.newBuilder()
                .setId(1L)
                .setName("Aditi")
                .setBatch("March2024")
                .setUniversity("MU").build();

        student.changeBatch("Jan2025");
    }
}
