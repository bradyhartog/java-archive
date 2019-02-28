import java.io.FileNotFoundException;

/**
 * Tests the methods of the CSVReader class.
 */
public class CSVTester {
    public static void main(String[] args) throws FileNotFoundException {
        CSVReader reader = new CSVReader("Input.txt");

        System.out.println(reader.numberOfRows());
        System.out.println(reader.numberOfFields(6));
        System.out.println(reader.field(6,2));
    }
}