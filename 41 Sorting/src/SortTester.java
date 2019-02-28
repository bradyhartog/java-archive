import util.Stopwatch;

public class SortTester {

    public static void main(String[] args) {
        int[] values = new int[] {2, 4, 5, 7, 1, 9, 8, 3, 6, 0};

        Stopwatch watch = new Stopwatch();
        watch.start();
        SelectionSort.sort(values);
        watch.stop();
        System.out.println("Elapsed Time: " + watch.getElapsedTime());
        System.out.println(SelectionSort.getResult(values));
    }
}