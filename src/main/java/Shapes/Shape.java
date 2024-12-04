package Shapes;

public abstract class Shape {
    String color; //TODO: Adjust to use the new Color type

    public Shape(String color) {
        this.color = color;
    }

    abstract public void draw();
}
