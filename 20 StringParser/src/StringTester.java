import java.util.Scanner;

public class StringTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to parse, or -1 to quit.");
        String input = in.nextLine();
        do {
            parseString(input);
            input = in.nextLine();
        } while(!"-1".equals(input));
    }

    private static void parseString(String input) {
        StringParser parser = new StringParser(input);
        System.out.println("");
        System.out.println("String in uppercase:   " + parser.getUpperCase());
        System.out.println("Every other character: " + parser.getEveryOther());
        System.out.println("Vowels replaced:       " + parser.replaceVowels());
        System.out.println("Total vowel count:     " + parser.getVowelCount());
        System.out.println("Vowel positions:       " + parser.getVowelPosition());
        System.out.println("");
        System.out.println("Enter a string to parse, or -1 to quit.");
    }
}