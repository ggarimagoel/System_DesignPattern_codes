package facade_pattern;



// Facade providing a simple interface
public class AudioPlayer {
    private Codec codec;
    private AudioDecoder audioDecoder;
    private AudioRenderer audioRenderer;

    public AudioPlayer() {
        this.codec = new Codec();
        this.audioDecoder = new AudioDecoder();
        this.audioRenderer = new AudioRenderer();
    }

    public void playAudio(String audioType, String fileName) {
        codec.decode(audioType, fileName);
        audioDecoder.decodeAudio(audioType, fileName);
        audioRenderer.render(audioType);
    }
}
