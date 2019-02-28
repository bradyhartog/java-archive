public class LexiMergeTester {
    public static void main(String[] args) {
        String[] names = new String[]{"Joe", "Sally", "Cindy", "Fred", "Bob", "Jessica", "Albert"};
        LexiMergeSort lexiMergeSort = new LexiMergeSort();
        lexiMergeSort.sort(names);
        String output = "";
        for(int i = 0; i < names.length; i++) {
            output = output + names[i] + ", ";
        }
        System.out.println(output.substring(0, (output.length() - 2)));
    }
}