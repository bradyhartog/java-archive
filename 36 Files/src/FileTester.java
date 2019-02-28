// Umm this is a mess, don't run it

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileTester {
    static String filename = "/Users/bradyhartog/Library/Mobile Documents/com~apple~CloudDocs/iCloud Drive/Documents/School/12th Grade/Comp Prog 2/Assignments/36 Files/src/doubleNums.txt";

    public static void main(String[] args) throws FileNotFoundException {
        readDouble();
        writeToFile();
    }

    private static void writeToFile() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("/Users/bradyhartog/Library/Mobile Documents/com~apple~CloudDocs/iCloud Drive/Documents/School/12th Grade/Comp Prog 2/Assignments/36 Files/src/doubleNumsAvg.txt");
        Scanner in  = getStream();
        int count = 0;
        double sum = 0;
        while (in.hasNextDouble()) {
            double value = in.nextDouble();
            out.printf("%8.2f\n", value);
            sum += value;
            count++;
        }
        out.printf("Total: %8.2f\n", sum);
        if (count > 0) {
            out.printf("Average: %8.2f", sum/count);
        }
        in.close();
        out.close();
    }

    private static Scanner getStream(String filename) throws FileNotFoundException {
        File inputFile = new File(filename);
        return new Scanner(inputFile);
    }

    private static void readDouble() throws FileNotFoundException {
        File inputFile = new File(filename);
        Scanner in  = new Scanner(inputFile);
        int count = 0;
        double sum = 0;
        while(in.hasNextDouble()) {
            double value = in.nextDouble();
            System.out.println(value);
            sum += value;
            count++;
        }
        in.close();

        if (count > 0) {
            System.out.println("Average: " + sum/count);
        }
    }

    private static void processCountries() {
        Scanner in = getStream(countryFile);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner stringScanner = new Scanner(line);
            stringScanner.useDelimiter("");
            boolean processingCountryRank = true;
            boolean processingCountryName = false;
            StringBuilder populationBuilder = new StringBuilder();
            while (stringScanner.hasNext()) {
                String character = stringScanner.next();
                if (processingCountryRank) {
                    if (!Character.isDigit(character.charAt(0))) {
                        processingCountryRank = false;
                        processingCountryName = true;
                    }
                } else if (processingCountryName) {
                    if (Character.isDigit(character.charAt(0))) {
                        processingCountryName = false;
                        populationBuilder.append(character);
                    }
                } else {
                    if (Character.isDigit(character.charAt(0))) {
                        populationBuilder.append(character);
                    } else if (Character.isWhitespace(character.charAt(0))) {
                        break;
                    }
                }
                try {
                    totalPopulation += Long.parseLong(populationBuilder.toString());
                    numCountries++;
                    System.out.println(Long.parseLong(populationBuilder.toString()));
                } catch(NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(line);
            }
            System.out.println("Average Population: ") + (totalPopulation / numCountries));
        }
    }
}