package lecture_assignments.oop3_inheritance_and_polymorphism.media_file_player;

public class MediaFilePlayer {

    public static void playMedia(MediaFile mediaFile) {
        System.out.println(mediaFile.getDetails());
        mediaFile.play();
    }

    public static void main(String[] args) {
        MediaFile audioFile = new AudioFile("Song Title", "Sonu Nigam", "audio.mp3");
        MediaFile videoFile = new VideoFile("Video Title", "video.mp4", "30");

        playMedia(audioFile);
        playMedia(videoFile);
    }
}
