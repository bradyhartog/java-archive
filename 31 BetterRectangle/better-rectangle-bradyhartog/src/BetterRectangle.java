import java.awt.*;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int width, int height, int x, int y) {
        super.setSize(width, height);
        super.setLocation(x, y);
    }

    public int getPerimeter() {
        return 2 * width + 2 * height;
    }

    public int getArea() {
        return width * height;
    }
}