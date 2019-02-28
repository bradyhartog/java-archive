import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringTester {
    public static void main(String[] args) {
        String[] names = new String[]{"Joe", "Sally", "Cindy", "Fred", "Bob", "Jessica", "Albert"};
        List<String> namesArray = Arrays.asList(names);
        System.out.println("Unsorted array: ");
        System.out.println(namesArray);
        System.out.println();
        Collections.sort(namesArray, new StringComparator());
        System.out.println("Sorted array: ");
        System.out.println(namesArray);
    }
}