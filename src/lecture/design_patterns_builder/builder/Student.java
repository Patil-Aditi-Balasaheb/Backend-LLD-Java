package lecture.design_patterns_builder.builder;

public class Student {
    private Long id;
    private String name;
    private String batch;
    private Double psp;
    private String university;

    public Student(Helper helper) {
        // validations
        if (helper.getId() == null) {
            throw new IllegalStateException("Student must have an id");
        }

        if (helper.getName() == null) {
            throw new IllegalStateException("Student must have a name");
        }

        // setting values
        this.id = helper.getId();
        this.name = helper.getName();
        this.batch = helper.getBatch();
        this.psp = helper.getPsp();
        this.university = helper.getUniversity();
    }

    public void changeBatch(String batch) {
        System.out.println("Old batch: " + this.batch);
        this.batch = batch;
        System.out.println("New batch: " + this.batch);
    }
}
