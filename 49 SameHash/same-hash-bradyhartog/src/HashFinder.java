import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Attempts to find words with the same hash code within a large file.
 */
public class HashFinder {
    Map<Integer, HashSet<String>> words = new HashMap<>();

    /**
     * Constructs a HashFinder object.
     */
    public HashFinder() {}

    /**
     * Computes the hashcode of a word and adds it to the map: into a new HashSet if its hashcode is thus far unique, or into the existing HashSet of its corresponding hashcode.
     * @param word input word from file
     */
    public void addWord(String word) {
        int hashCode = word.hashCode();
        HashSet<String> sameHash = words.get(hashCode);
        if(sameHash == null) {
            sameHash = new HashSet<>();
            words.put(hashCode, sameHash);
        }
        sameHash.add(word);
    }

    /**
     * Parses the words map for words with the same hashcode.
     * @return the common hashcode(s) and their associated words
     */
    public String findSameHash() {
        String output = "";
        for(Integer key : words.keySet()) {
            HashSet<String> hashSet = words.get(key);
            if(hashSet.size() > 1) {
                output += key + ": ";
                for(String word : hashSet) {
                    output += word + ", ";
                }
            }
        }
        return output.substring(0, output.length() - 2);
    }
}