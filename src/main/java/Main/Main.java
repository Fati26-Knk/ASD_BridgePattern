package Main;

import Colors.*;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();
        Shape redCircle = new Circle(red); // TODO: Adjust to use the new Color-Type instead of String
        Shape blueRectangle = new Rectangle(blue); // TODO: Adjust to use the new Color-Type instead of String

        redCircle.draw();
        blueRectangle.draw();
    }
}