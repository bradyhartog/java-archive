/**
 * Computes the sum of all integers in an array.
 */
public class ArraySummer {
    private int[] values;

    /**
     * Constructs an ArraySummer object.
     * @param values an array of integers
     */
    public ArraySummer(int[] values) {
        this.values = values;
    }

    /**
     * Sums the array
     * @return the sum
     */
    public int sum() {
        return sum(0);
    }

    /**
     * Recursively sums an array
     * @param index the current position
     * @return the sum
     */
    private int sum(int index) {
        if(index == values.length - 1) {
            return values[index];
        }
        return values[index] + sum(index + 1);
    }
}