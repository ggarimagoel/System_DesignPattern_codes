package facade_pattern;





// Client code using the simplified AudioPlayer interface
public class Client_1 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playAudio("mp3", "song.mp3");
    }
}
