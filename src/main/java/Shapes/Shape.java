package Shapes;

import Colors.Color;

public abstract class Shape {
    public Color color; //TODO: Adjust to use the new Color type

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void draw();
}
