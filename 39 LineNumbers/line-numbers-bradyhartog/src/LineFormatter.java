import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Formats an input file with line numbers.
 */

public class LineFormatter {
    File input;
    File output;

    /**
     * Constructs a LineFormatter object.
     * @param inputFileName the input file name
     * @param outputFileName the output file name
     */
    public LineFormatter(String inputFileName, String outputFileName) {
        input = new File(inputFileName);
        output = new File(outputFileName);
    }

    /**
     * Writes the contents of the input file to the output file with the added line numbers.
     * @return done statement
     * @throws FileNotFoundException
     */
    public String formatLines() throws FileNotFoundException {
        Scanner in = new Scanner(input);
        PrintWriter out = new PrintWriter(output);
        int lineNumber = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            out.println("/* " + lineNumber + " */ " + line);
            lineNumber++;
        }
        in.close();
        out.close();
        return "File successfully formatted.";
    }
}