package Shapes;

public class Rectangle extends Shape {
    public Rectangle(String color) { // TODO: Adjust to use the new Color type
        super(color);
    }

    @Override
    public void draw() {
        // TODO: Apply color using the method from the color object (implemented from the Color interface)
        System.out.println("Drawing Rectangle in " + color);
    }
}