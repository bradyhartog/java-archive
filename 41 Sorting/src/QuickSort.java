public class QuickSort {
    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort (int[] array, int start, int end) {
        if (start < end) {
            int partition = partition(array, start, end);
            quickSort(array, start, partition - 1);
            quickSort(array, partition + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] <= pivot) {
                i++;
                int iVar = array[i];
                int jVar = array[j];
                array[i] = jVar;
                array[j] = iVar;
            }
        }
        i++;
        array[end] = array[i];
        array[i] = pivot;

        return i;
    }
}