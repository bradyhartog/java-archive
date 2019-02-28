package org.canyonsdistrict.math;

public class Expression {
    private ExpressionTokenizer tokenizer;

    /**
     * Construts an expression
     * @param expression
     */
    public Expression (String expression) {
        tokenizer = new ExpressionTokenizer(expression);
    }

    /**
     * Evaluates an expression
     * @return value of expression
     */
    public int getExpressionValue() {
        int value = getTermValue();
        boolean done = false;
        String nextToken = tokenizer.peekToken();
        if (nextToken == null) {
            done = true;
        }
        while (!done) {
            if ("+".equals(nextToken) || "-".equals(nextToken)) {
                tokenizer.nextToken();
                int rightValue = getTermValue();
                if ("+".equals(nextToken)) {
                    value = value + rightValue;
                } else {
                    value = value - rightValue;
                }
            } else {
                done = true;
            }
        }
    }

    /**
     * Evaluates the next term found in the expression
     * @return value of term
     */
    public int getTermValue() {
        int value = getFactorValue();
        boolean done = false;
        while (!done) {
            String nextToken = tokenizer.peekToken();
            if ("*".equals(nextToken) || "/".equals(nextToken)) {
                tokenizer.nextToken();
                int rightValue = getFactorValue();
                if ("*".equals(nextToken)) {
                    value = value * rightValue;
                } else {
                    value = value / rightValue;
                }
            } else {
                done = true;
            }
        }
    }

    public int getFactorValue() {
        int value = 0;
        String nextToken = tokenizer.peekToken();
        if ("(".equals(nextToken)) {
            tokenizer.nextToken();
            value = getExpressionValue();
            tokenizer.nextToken();
        }

        return value;
    }
}