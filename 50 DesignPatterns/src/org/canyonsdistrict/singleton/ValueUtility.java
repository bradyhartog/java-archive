package org.canyonsdistrict.singleton;

public class ValueUtility {
    private int value;

    private static ValueUtility instance;

    public static ValueUtility getInstance() {
        if (instance == null) {
            instance = new ValueUtility();
        }
        return instance;
    }

    private ValueUtility(){}

    public int getValue() {
        return value;
    }

    public void incrementValue() {
        value++;
    }
}