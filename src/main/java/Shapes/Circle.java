package Shapes;

import Colors.Color;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Drawing Circle in ");
        super.color.applyColor();
        System.out.print('\n');
    }
}