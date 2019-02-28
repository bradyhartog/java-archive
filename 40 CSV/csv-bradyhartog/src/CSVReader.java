import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Provides various methods for parsing a CSV file.
 */
public class CSVReader {
    File input;

    /**
     * Constructs a CSVReader object.
     * @param inputFileName
     */
    public CSVReader(String inputFileName) {
        input = new File(inputFileName);
    }

    /**
     * Computes the total number of rows in the file.
     * @return number of rows
     * @throws FileNotFoundException
     */
    public int numberOfRows() throws FileNotFoundException {
        Scanner in = new Scanner(input);
        int rows = 0;
        while(in.hasNextLine()) {
            in.nextLine();
            rows++;
        }
        return rows;
    }

    /**
     * Computes the total number of fields in a given row.
     * @param row row number
     * @return number of fields
     * @throws FileNotFoundException
     */
    public int numberOfFields(int row) throws FileNotFoundException {
        Scanner in = new Scanner(input);
        for(int i = 0; i < row - 1; i++) {
            in.nextLine();
        }
        int numberOfFields = 0;
        String line = in.nextLine();
        Scanner in2 = new Scanner(line);
        in2.useDelimiter(",");
        while(in2.hasNext()) {
            in2.next();
            numberOfFields++;
        }
        return numberOfFields;
    }

    /**
     * Returns a field specified by row and column.
     * @param row row number
     * @param column column number
     * @return specified field
     * @throws FileNotFoundException
     */
    public String field(int row, int column) throws FileNotFoundException {
        Scanner in = new Scanner(input);
        for(int i = 0; i < row - 1; i++) {
            in.nextLine();
        }
        String line = in.nextLine();
        Scanner in2 = new Scanner(line);
        in2.useDelimiter(",");
        for(int i = 0; i < column - 1; i++) {
            in2.next();
        }
        return in2.next();
    }
}