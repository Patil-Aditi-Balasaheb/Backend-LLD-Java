package lecture.design_patterns_builder.builder_in_production;

public class Student {
    private Long id;
    private String name;
    private String batch;
    private Double psp;
    private String university;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.batch = builder.batch;
        this.psp = builder.psp;
        this.university = builder.university;
    }

    // Student class provides a static method to get a builder for its creation
    public static Builder newBuilder() {
        return new Builder();
    }

    static class Builder {
        private Long id;
        private String name;
        private String batch;
        private Double psp;
        private String university;

        private Builder() {
        }

        public Student build() {
            return new Student(this);
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }
    }

    public void changeBatch(String batch) {
        System.out.println("Old batch: " + this.batch);
        this.batch = batch;
        System.out.println("New batch: " + this.batch);
    }
}
