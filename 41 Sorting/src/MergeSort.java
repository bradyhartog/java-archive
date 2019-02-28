public class MergeSort {
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int tempArray[] = new int[end - start + 1];

        int leftPosition = start;
        int rightPosition = mid + 1;
        int i = 0;

        while (leftPosition <= mid && rightPosition <= end) {
            if (array[leftPosition] < array[rightPosition]) {
                tempArray[i] = array[leftPosition];
                leftPosition++;
            } else {
                tempArray[i] = array[rightPosition];
                rightPosition++;
            }
            i++;
        }

        if (leftPosition <= mid) {
            while (leftPosition <= mid) {
                tempArray[i] = array[leftPosition];
                leftPosition++;
                i++;
            }
        } else if (rightPosition <= end) {
            while (rightPosition <= end) {
                tempArray[i] = array[rightPosition];
                rightPosition++;
                i++;
            }
        }

        for (int j = 0; j < tempArray.length; j++) {
            array[start + j] = tempArray[j];
        }
    }
}