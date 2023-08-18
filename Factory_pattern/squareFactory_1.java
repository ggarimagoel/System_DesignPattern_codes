package Factory_pattern;

public class squareFactory_1 implements shapeFactory_1{
    @Override
    public Shape_1 createShape() {
        return new circle_1();
    }
}
