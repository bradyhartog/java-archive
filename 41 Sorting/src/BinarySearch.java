public class BinarySearch {
    public static int binarySearch(int[] array, int x) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (x < array[mid]) {
                end = mid - 1;
            } else if (x > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}