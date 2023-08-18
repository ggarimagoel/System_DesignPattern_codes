package Factory_pattern;

public class circleFactory_1 implements shapeFactory_1{
    public Shape_1 createShape() {
        return new square_1();
    }
}
