package org.canyonsdistrict.math;

import java.util.Scanner;

public class ExpressionTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String input = in.nextLine();
        Expression exp = new Expression(input);
        int expressionValue = exp.getExpressionValue();
        System.out.println(input + "=" + expressionValue);
    }
}