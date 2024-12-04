package Shapes;

import Colors.Color;

public class Rectangle extends Shape {
    public Rectangle(Color color) { // TODO: Adjust to use the new Color type
        super(color);
    }

    @Override
    public void draw() {
        // TODO: Apply color using the method from the color object (implemented from the Color interface)
        System.out.print("Drawing Rectangle in ");
        super.color.applyColor();
        System.out.print('\n');
    }
}