import java.util.ArrayList;

/**
 * Accommodates and processes input for a series of floating point numbers.
 */
public class Floats {
    ArrayList<Double> myFloats;
    double sum;

    /**
     * Constructs a Floats object.
     */
    public Floats() {
        myFloats = new ArrayList<>();
        double sum = 0;
    }

    /**
     * Adds a user's floating point input to the myFloats array.
     * @param nextFloat user input
     * @return end of sequence indicator, based on sentinel value -1
     */
    public boolean addFloat(double nextFloat) {
        if (Double.toString(nextFloat).equals("-1.0")) {
            return true;
        } else {
            myFloats.add(nextFloat);
            return false;
        }
    }

    /**
     * Sums all correctly specified floating point values in the myFloats array.
     * @return sum of myFloats
     */
    public double sum() {
        for(int i = 0; i < myFloats.size(); i++) {
            sum += myFloats.get(i);
        }
        return sum;
    }
}