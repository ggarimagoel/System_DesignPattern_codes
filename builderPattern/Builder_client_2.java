package builderPattern;

public class Builder_client_2 {
    public static void main(String[] args) {
    computer_2 comp = computer_2.getBuilder().
            setRam(2).
            setCpu("intel i5").
            setStorage(256).build();

        System.out.println(comp.toString());
    }
}
