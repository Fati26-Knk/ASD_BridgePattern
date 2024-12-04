package Main;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle("Red"); // TODO: Adjust to use the new Color-Type instead of String
        Shape blueRectangle = new Rectangle("Blue"); // TODO: Adjust to use the new Color-Type instead of String

        redCircle.draw();
        blueRectangle.draw();
    }
}