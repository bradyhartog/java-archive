public class StringParser {
    private String string;

    /**
     * Constructs a string parser object
     * @param string the string to parse
     */
    public StringParser(String string) {
        this.string = string;
    }

    /**
     * Get the uppercase letters in the string
     * @return uppercase letters
     */
    public String getUpperCase() {
        String upperCase = "";
        char[] characters = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(characters[i])) {
                upperCase += characters[i];
            }
        }
        return upperCase;
    }

    /**
     * Get every other character in the string
     * @return every other character
     */
    public String getEveryOther() {
        String everyOther = "";
        int counter = 0;
        while(counter < string.length()) {
            if (counter % 2 == 0) {
                everyOther += string.charAt(counter);
            }
            counter++;
        }
        return everyOther;
    }

    /**
     * Replaces each vowel in the string
     * @return the modified string
     */
    public String replaceVowels() {
        String replaced = "";
        for (int i = 0; i < string.length(); i++) {
            switch(string.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    replaced += '_';
                    break;
                default:
                    replaced += string.charAt(i);
            }
        }
        return replaced;
    }

    /**
     * Counts number of vowels in the string
     * @returnthe number of vowels
     */
    public int getVowelCount() {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            switch(string.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }

    /**
     * Prints the position of each vowel in the string
     * @return positions of vowels
     */
    public String getVowelPosition() {
        String vowelPosition = "";
        int count = 0;
        while (count < string.length()) {
            if (string.charAt(count) == 'A' || string.charAt(count) == 'a' || string.charAt(count) == 'E' || string.charAt(count) == 'e' || string.charAt(count) == 'I' || string.charAt(count) == 'i' || string.charAt(count) == 'O' || string.charAt(count) == 'o' || string.charAt(count) == 'U' || string.charAt(count) == 'u') {
                vowelPosition += string.charAt(count) + ": " + count + "  ";
            }
            count++;
        }
        return vowelPosition;
    }
}