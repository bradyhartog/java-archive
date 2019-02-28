package assignment11;

/**
 * Computes pi using a well-known algorithm--first, by Fraction objects only, then by including an intermittent double value.
 */
public class ComputePi {
    public static void main(String[] args) {
        // Declare variables

        Fraction pi_frac = new Fraction();
        double pi_double;
        int max_k = 0;

        Fraction prev_pi_frac;
        Fraction sum_term;

        // Fraction Looping
        // Computes pi using Fraction objects.

        for (int k = 0; k < 1000000; k++) {
            // Remember previous result for comparison
            prev_pi_frac = pi_frac;

            // Define terms for this iteration
            Fraction coefficient = new Fraction(1, 16);
            coefficient = coefficient.power(k);
            Fraction term1 = new Fraction(4, 8 * k + 1);
            Fraction term2 = new Fraction(2, 8 * k + 4);
            Fraction term3 = new Fraction(1, 8 * k + 5);
            Fraction term4 = new Fraction(1, 8 * k + 6);

            // Make computation
            sum_term = coefficient.multiply(term1.subtract(term2).subtract(term3).subtract(term4));

            // Define results
            pi_frac = pi_frac.add(sum_term);
            pi_double = pi_frac.to_double();

            // Detect overflow to halt computation
            if (pi_double < 3 || pi_double > 4) {
                max_k = k - 1;
                pi_frac = prev_pi_frac;
                break;
            }
        }

        // Print results

        System.out.println();
        System.out.println("Fraction Looping");
        System.out.println("----------------");
        System.out.println("Fraction result: " + pi_frac.to_string());
        System.out.println("Double result:   " + pi_frac.to_double());
        System.out.println("Maximum k value: " + max_k);
        System.out.println();

        // Double Looping
        // Computes pi using an intermittent double value along with Fraction objects.

        pi_double = 0;
        double prev_pi_double;
        double sum_term_double;

        for (int k = 0; k < 1000000; k++) {
            // Remember previous result for comparison
            prev_pi_double = pi_double;

            // Define terms for this iteration
            Fraction coefficient = new Fraction(1, 16);
            coefficient = coefficient.power(k);
            Fraction term1 = new Fraction(4, 8*k+1);
            Fraction term2 = new Fraction(2, 8*k+4);
            Fraction term3 = new Fraction(1, 8*k+5);
            Fraction term4 = new Fraction(1, 8*k+6);

            // Make computation
            sum_term_double = coefficient.to_double() * (term1.to_double() - term2.to_double() - term3.to_double() - term4.to_double());

            // Define result
            pi_double += sum_term_double;

            // Detect overflow to halt computation
            if (pi_double < 3 || pi_double > 4) {
                max_k = k - 1;
                pi_double = prev_pi_double;
                break;
            }
        }

        // Print results

        System.out.println("Double Looping");
        System.out.println("--------------");
        System.out.println("Double result:   " + pi_double);
        System.out.println("Maximum k value: " + max_k);
        System.out.println();
    }
}