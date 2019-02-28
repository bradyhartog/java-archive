import java.util.Comparator;

/**
 * Sorts strings by length
 */
public class StringComparator implements Comparator<String> {
    /**
     * Sort two strings by length and then lexigraphically
     * @param first first string
     * @param second second string
     * @return -1 if first comes first, 1 if second comes first
     */
    @Override
    public int compare(String first, String second) {
        if(first.length() < second.length()) {
            return -1;
        } else if(second.length() < first.length()) {
            return 1;
        }
        return first.compareTo(second);
    }
}