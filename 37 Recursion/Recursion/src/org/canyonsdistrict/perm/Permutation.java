package org.canyonsdistrict.perm;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    /*
    "sit" "sti" "tsi" "tis" "its" "ist"
     */

    public List<String> getPermutations(String word) {
        List<String> permutations = new ArrayList<>();
        if (word.length() == 0) {
            permutations.add(word);
        } else {
            for(int i = 0; i < word.length(); i++) {
                String shorterWord = word.substring(0, i) + word.substring(i + 1);

                List<String> shorterPermutations = getPermutations(shorterWord);
                for (String s : shorterPermutations) {
                    permutations.add(word.charAt(i) + s);
                }
            }
        }
        return permutations;
    }
}