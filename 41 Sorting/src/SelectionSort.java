public class SelectionSort {

    public static void sort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int smallest = getSmallest(values, i);
            swapValues(values, i, smallest);
        }
    }

    private static void swapValues(int[] values, int i, int smallest) {
        int temp = values[smallest];
        values[smallest] = values[i];
        values[i] = temp;
    }

    private static int getSmallest(int[] values, int from) {
        int smallest = from;
        for (int i = from; i < values.length - 1; i++) {
            if (values[i] < values[smallest]) {
                smallest = 1;
            }
        }
        return smallest;
    }

    public static String getResult(int values[]) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            builder.append(values[i]);
            if (i < values.length - 1) {
                builder.append(",");
            }
        }
        return builder.toString();
    }
}