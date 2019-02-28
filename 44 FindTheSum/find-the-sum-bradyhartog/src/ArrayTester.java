public class ArrayTester {
    public static void main(String[] args) {
        int[] values = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        ArraySummer summer = new ArraySummer(values);
        System.out.println("The sum is " + summer.sum());
    }
}