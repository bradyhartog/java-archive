public class Triangle {
    private int width;

    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        if (width <= 0) {
            return 0;
        } else if (width == 1) {
            return width;
        } else {
            Triangle smallerTriangle = new Triangle (width - 1);
            int smallTriangleArea = smallerTriangle.getArea();
            return smallTriangleArea + width;
        }
    }

    public int getAreaLoop() {
        int area = 0;
        for (int i = 1; i <= width; i++) {
            area += i;
        }
        return area;
    }

    public int getAreaMath() {
        return width * (width + 1) / 2;
    }
}