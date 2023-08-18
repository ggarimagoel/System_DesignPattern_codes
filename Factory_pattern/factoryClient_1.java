package Factory_pattern;

public class factoryClient_1 {
    public static void main(String[] args) {
    shapeFactory_1 circleFact = new circleFactory_1();
    Shape_1 circle = circleFact.createShape();
    circle.draw();

    shapeFactory_1 squareFact = new squareFactory_1();
    Shape_1 square = squareFact.createShape();
    square.draw();
    }
}
