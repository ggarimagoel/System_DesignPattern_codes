package Factory_pattern;



//concrete products
public class circle_1 implements Shape_1{
    @Override
    public void draw() {
        System.out.println("draw a circle");
    }
}
