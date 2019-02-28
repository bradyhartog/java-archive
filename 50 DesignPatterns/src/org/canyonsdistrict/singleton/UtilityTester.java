package org.canyonsdistrict.singleton;

public class UtilityTester {
    public static void main(String[] args) {
        ValueUtility v = ValueUtility.getInstance();
        v.incrementValue();
        System.out.println(v.getValue());
        ValueUtility v2 = ValueUtility.getInstance();
        v2.incrementValue();
        System.out.println(v2.getValue());
    }
}