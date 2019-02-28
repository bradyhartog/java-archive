/**
 * Describes an object that can be measured
 */
public interface Measure {

    /**
     * Computes the measurement of the object
     * @param obj the object to measure
     * @return the measurement
     */
    double measure(Object obj);
}