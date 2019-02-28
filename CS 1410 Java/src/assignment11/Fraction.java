package assignment11;

import static java.lang.Math.abs;

/** Fraction
 *
 * A fraction object represents a single rational number (a fraction).
 * If a fraction is negative, the numerator will be negative. A
 * fraction object should not have a non-positive denominator. Also,
 * fraction objects are always stored using their most reduced
 * representation.
 *
 * The user of a fraction object is not allowed to change the numerator
 * or denominator of a fraction object.
 *
 * Additional fraction objects can be formed by multiplying or adding
 * a fraction object with another fraction object.
 *
 * Fractions can also be converted to strings or doubles.
 */
public class Fraction {
    private long numerator;
    private long denominator;

    /** Fraction constructor:
     *
     * This default constructor creates the fraction
     * representing the number 0.
     *
     * (Notice that no return type is specified.  The
     * function name is the class name for a constructor.)
     */
    public Fraction() {
        // Set this object's variables to represent 0.

        numerator = 0;
        denominator = 1;
    }

    /** Fraction constructor:
     *
     * This constructor creates the fraction
     * representing the number specified by the numerator
     * and denominator parameters, i.e. numerator/denominator.
     *
     * The denominator is not allowed to be 0. (No error
     * checking is done--you haven't learned exceptions yet.)
     *
     * (Notice that no return type is specified.  The
     * function name is the class name for a constructor.)
     *
     * Parameters:
     *   long _numerator -- some numerator
     *   long _denominator -- some denominator
     */
    public Fraction(long _numerator, long _denominator) {
        // Copy the parameter values into this object's variables.

        numerator = _numerator;
        denominator = _denominator;

        // Ensure the denominator is not negative.

        // (Students will add statements here for the assignment.)

        // Reduce the fraction (as required by the class contract).
        //   We'll just use our private function to help us.

        reduce();
    }

    /** This function reduces this fraction object.  It first
     * computes the greatest common divisor of the numerator
     * and denominator. Then, it divides both the numerator
     * and denominator by that greatest common divisor.
     */
    private void reduce() {
        // Compute the greatest common divisor using a
        //   well-known algorithm.
        long gcd = numerator;
        long remainder = denominator;

        while (remainder != 0) {
            long temp = remainder;
            remainder = gcd % remainder;
            gcd = temp;
        }

        // Divide both the numerator and denominator by the
        //   greatest common divisor.

        numerator /= gcd;
        denominator /= gcd;
    }

    /** Returns a string that contains text representing
     * this fraction in the form "numerator/denominator".
     *
     * Returns:
     *   a string -- the fraction converted to a string
     */
    public String to_string() {
        String result = "";
        if (denominator == 1) {
            result += numerator;
        } else {
            result = result + numerator + "/" + denominator;
        }

        return result;
    }

    /** Returns a double value that is the approximation
     * of this fraction object.
     *
     * Returns:
     *   a double -- a floating point approximation of the number represented by this Fraction
     */
    public double to_double() {
        return numerator/(double)denominator;
    }

    /** Adds this fraction object to the provided fraction
     * object (without changing this object).  The sum
     * is returned in a separate fraction object.
     *
     * Parameters:
     *   Fraction right -- some other fraction object
     *
     * Returns:
     *   A Fraction object -- represents the value equal to
     *                        this object + right object.
     */
    Fraction add(Fraction right) {
        // Compute the sum.

        long sum_numerator, sum_denominator;

        sum_numerator = numerator * right.denominator + right.numerator * denominator;

        sum_denominator = denominator * right.denominator;

        // Create the resulting fraction.

        Fraction result = new Fraction(sum_numerator, sum_denominator);

        // Return it.

        return result;
    }

    /** Subtracts this fraction object to the provided fraction
     * object (without changing this object).  The difference
     * is returned in a separate fraction object.
     *
     * Parameters:
     *   Fraction right -- some other fraction object
     *
     * Returns:
     *   A Fraction object -- represents the value equal to
     *                        this object - right object.
     */
    Fraction subtract(Fraction right) {
        // Compute the difference.

        long dif_numerator, dif_denominator;

        dif_numerator = numerator * right.denominator - right.numerator * denominator;

        dif_denominator = denominator * right.denominator;

        // Create the resulting fraction.

        Fraction result = new Fraction(dif_numerator, dif_denominator);

        // Return it.

        return result;
    }

    /** Multiplies this fraction object with the provided fraction
     * object (without changing this object).  The product
     * is returned in a separate fraction object.
     *
     * Parameters:
     *   Fraction right -- some other fraction object
     *
     * Returns:
     *   A Fraction object -- represents the value equal to
     *                        this object * right object.
     */
    Fraction multiply(Fraction right) {
        // Compute the product.

        long product_numerator, product_denominator;

        product_numerator   = numerator   * right.numerator;
        product_denominator = denominator * right.denominator;

        // Create the resulting fraction.

        Fraction result = new Fraction(product_numerator, product_denominator);

        // Return it.

        return result;
    }

    /** Divides this fraction object with the provided fraction
     * object (without changing this object).  The quotient
     * is returned in a separate fraction object.
     *
     * Parameters:
     *   Fraction right -- some other fraction object
     *
     * Returns:
     *   A Fraction object -- represents the value equal to
     *                        this object / right object.
     */
    Fraction divide(Fraction right) {
        // Compute the quotient.

        long quotient_numerator, quotient_denominator;

        quotient_numerator   = numerator   * right.denominator;
        quotient_denominator = denominator * right.numerator;

        // Create the resulting fraction.

        Fraction result = new Fraction(quotient_numerator, quotient_denominator);

        // Return it.

        return result;
    }

    /** Raises this fraction object to the provided integer
     * power (without changing this object).  The result
     * is returned in a separate fraction object.
     *
     * Parameters:
     *   int x -- an integer power
     *
     * Returns:
     *   A Fraction object -- represents the value equal to
     *                        this object ^ x.
     */
    Fraction power(int x) {
        // Compute the result.

        long result_numerator = numerator;
        long result_denominator = denominator;

        long initial_numerator = numerator;
        long initial_denominator = denominator;

        for (int i = 0; i < abs(x)-1; i++) {
            result_numerator *= initial_numerator;
            result_denominator *= initial_denominator;
        }

        // Create the resulting fraction.

        if (x == 0) {
            result_numerator = 1;
            result_denominator = 1;
        }

        if (x < 0) {
            long temp = result_numerator;
            result_numerator = result_denominator;
            result_denominator = temp;
        }

        Fraction result = new Fraction(result_numerator, result_denominator);

        // Return it.

        return result;
    }
}