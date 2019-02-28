public class TriangleTester {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(1);
        System.out.println("Area of triangle of width 1 = " + triangle1.getArea());

        Triangle triangle4 = new Triangle(4);
        System.out.println("Area of triangle of width 4 = " + triangle4.getArea());

        Triangle triangle6 = new Triangle(6);
        System.out.println("Area of triangle of width 6 = " + triangle6.getArea());

        System.out.println("Area of triangle of width 6 (Loop) = " + triangle6.getAreaLoop());
        System.out.println("Area of triangle of width 6 (Math) = " + triangle6.getAreaMath());
    }
}