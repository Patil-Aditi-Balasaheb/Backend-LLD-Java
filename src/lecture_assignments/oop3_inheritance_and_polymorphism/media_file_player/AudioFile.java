package lecture_assignments.oop3_inheritance_and_polymorphism.media_file_player;

public class AudioFile extends MediaFile {
    private final String artist;

    public AudioFile(String title, String artist, String fileName) {
        super(title, fileName);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing audio file: " + fileName);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Artist: " + artist;
    }
}
