package Shapes;

public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle in " + color);
    }
}