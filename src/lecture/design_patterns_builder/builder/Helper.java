package lecture.design_patterns_builder.builder;

public class Helper {
    private Long id;
    private String name;
    private String batch;
    private Double psp;
    private String university;

    public Long getId() {
        return id;
    }

    public Helper setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Helper setName(String name) {
        this.name = name;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public Helper setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public Double getPsp() {
        return psp;
    }

    public Helper setPsp(Double psp) {
        this.psp = psp;
        return this;
    }

    public String getUniversity() {
        return university;
    }

    public Helper setUniversity(String university) {
        this.university = university;
        return this;
    }
}
