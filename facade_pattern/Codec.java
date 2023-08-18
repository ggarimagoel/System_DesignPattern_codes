package facade_pattern;

public class Codec {
    public void decode(String audioType, String fileName) {
        System.out.println("Decoding " + audioType + " file: " + fileName);
    }
}
