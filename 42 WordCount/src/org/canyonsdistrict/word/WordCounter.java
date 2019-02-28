package org.canyonsdistrict.word;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) throws FileNotFoundException {
        checkSpelling();
    }

    private static void wordCount() throws FileNotFoundException {
        Map<String, Integer> wordCount = new TreeMap<>();
        Scanner in = new Scanner(new File("war and peace.txt"));
        while(in.hasNext()) {
            String word = getWord(in.next());

            if(word.length() > 0) {
                if(wordCount.containsKey(word)) {
                    Integer count = wordCount.get(word);
                    wordCount.put(word, ++count);
                } else {
                    wordCount.put(word, 1);
                }

                Integer countVal = wordCount.get(word);
                if (countVal != null) {
                    countVal++;
                    wordCount.put(word, countVal);
                } else {
                    wordCount.put(word, 1);
                }

                wordCount.merge(word, 1, (oldValue, value) -> oldValue + value);
            }
        }

        for(String key : wordCount.keySet()) {
            System.out.println("Key: " + key + " count " + wordCount.get(key));
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " count " + entry.getValue());
        }
    }

    private static void checkSpelling() throws FileNotFoundException {
        Set<String> dictionary = getDictionary();
        Scanner in = new Scanner(new File("war and peace.txt"));
        while(in.hasNext()) {
            String word = getWord(in.next());
            if(!dictionary.contains(word)) {
                System.out.println(word + " is misspelled");
            }
        }
    }

    private static Set<String> getDictionary() throws FileNotFoundException {
        Scanner in = new Scanner(new File("en_US.dic"));
        Set<String> dictionary = new HashSet<>();
        while(in.hasNextLine()) {
            dictionary.add(in.nextLine().toLowerCase());
        }
        return dictionary;
    }

    private static String getWord(String characters) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < characters.length(); i++) {
            char c = characters.charAt(i);
            if (Character.isLetter(c)) {
                word.append(c);
            }
        }
        return word.toString();
    }
}