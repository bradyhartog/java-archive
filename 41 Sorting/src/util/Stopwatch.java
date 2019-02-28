package util;

public class Stopwatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public void start() {
        if (!isRunning) {
            return;
        }
        isRunning = true;
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        if (!isRunning) {
            return;
        }
        isRunning = false;
        long endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
    }

    public long getElapsedTime() {
        if (isRunning) {
            long endTime = System.currentTimeMillis();
            return elapsedTime + endTime - startTime;
        }
        return elapsedTime;
    }

    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }
}