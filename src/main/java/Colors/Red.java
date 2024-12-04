package Colors;

public class Red implements Color {
    public final String color = "Red";

    @Override
    public void applyColor() {
        System.out.print(color);
    }
}
