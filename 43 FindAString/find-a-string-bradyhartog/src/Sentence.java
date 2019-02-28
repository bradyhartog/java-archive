/**
 * Search for strings within strings.
 */
public class Sentence {
    private static Sentence instance;

    /**
     * Constructs a sentence.
     */
    private Sentence() {}

    /**
     * Returns the instance.
     * @return the instance
     */
    public static Sentence getInstance() {
        if(instance == null) {
            instance = new Sentence();
        }
        return instance;
    }

    /**
     * Searches for a string within a string.
     * @param text the whole string
     * @param str value to look for
     * @return true if str is in text
     */
    public boolean find(String text, String str) {
        if(text == null || text.length() == 0) {
            return false;
        }
        if(text.startsWith(str)) {
            return true;
        }
        return find(text.substring(1), str);
    }
}