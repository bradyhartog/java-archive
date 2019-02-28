public class SentenceTester {
    public static void main(String[] args) {
        String longString = "Mississippi";
        String searchValue1 = "sip";
        String searchValue2 = "tip";

        boolean foundValue1 = Sentence.getInstance().find(longString, searchValue1);
        boolean foundValue2 = Sentence.getInstance().find(longString, searchValue2);

        printOutput(longString, searchValue1, foundValue1);
        printOutput(longString, searchValue2, foundValue2);
    }

    private static void printOutput(String longString, String searchValue, boolean foundValue) {
        System.out.printf("%s %s contain %s\n", longString, foundValue ? "does" : "does not", searchValue);
    }
}