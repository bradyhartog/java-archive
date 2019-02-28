/**
 * Filters an object
 */
public interface Filter {

    /**
     * Accepts or rejects an object
     * @param x the object to be filtered
     * @return true if accepted
     */
    boolean accept(Object x);
}