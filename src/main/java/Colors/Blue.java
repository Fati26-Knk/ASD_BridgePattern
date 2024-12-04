package Colors;

public class Blue implements Color {
    public final String color = "Blue";

    @Override
    public void applyColor() {
        System.out.print(color);
    }
}
