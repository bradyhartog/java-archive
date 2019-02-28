import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Tests the LineFormatter class with user-specified file name inputs.
 */
public class FormatterTester {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("Enter input file name: ");
        Scanner in = new Scanner(System.in);
        String inputFileName = in.next();
        System.out.print("Enter output file name: ");
        String outputFileName = in.next();

        LineFormatter lineFormatter = new LineFormatter(inputFileName, outputFileName);

        System.out.println();
        System.out.println(lineFormatter.formatLines());
    }
}