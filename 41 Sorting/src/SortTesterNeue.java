public class SortTesterNeue {
    public static void main(String[] args) {
        int[] array = new int[] {3, 98, 2, 45, 6, 17, 22, 46};
        //MergeSort.mergeSort(array);
        //InsertionSort.insertionSort(array);
        QuickSort.quickSort(array);

        printArray(array);

        //int foundLinear = LinearSearch.linearSearch(array, 98);
        //System.out.println("Index of 98: " + foundLinear);
        int foundBinary = BinarySearch.binarySearch(array, 98);
        System.out.println("Index of 98: " + foundBinary);
    }

    public static void printArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(",");
            }
        }
        System.out.println(builder.toString());
    }
}