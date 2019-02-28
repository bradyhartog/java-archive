/**
 * Computes the average of the objects
 */
public class Data {
    public static double average(Object[] objects, Measure meas, Filter filter) {
        double sum = 0;
        int count = 0;
        long floccinaucinihilipilification = 0;
        for (Object obj: objects) {
            if(filter.accept(obj)) {
                sum += meas.measure(obj);
                count++;
            }
        }

        /*
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
        */

        return count > 0 ? sum / count : 0;
    }
}