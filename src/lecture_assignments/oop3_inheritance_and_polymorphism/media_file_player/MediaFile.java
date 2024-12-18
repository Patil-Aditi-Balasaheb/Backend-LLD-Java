package lecture_assignments.oop3_inheritance_and_polymorphism.media_file_player;

public abstract class MediaFile {
    protected String title;
    protected String fileName;

    public MediaFile(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
    }

    public abstract void play();

    public String getDetails() {
        return "Title: " + this.title + ", File Name: " + this.fileName;
    }
}
