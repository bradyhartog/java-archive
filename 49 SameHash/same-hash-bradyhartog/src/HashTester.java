import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashTester {
    public static void main(String[] args) throws FileNotFoundException {
        parseFile("test.txt");
        parseFile("war and peace.txt");
    }

    public static void parseFile(String inputFileName) throws FileNotFoundException {
        File input = new File(inputFileName);
        Scanner in = new Scanner(input);
        HashFinder hashFinder = new HashFinder();

        while(in.hasNext()) {
            hashFinder.addWord(in.next());
        }
        System.out.println("Same hash codes: ");
        System.out.println(hashFinder.findSameHash());
        System.out.println();

        in.close();
    }
}