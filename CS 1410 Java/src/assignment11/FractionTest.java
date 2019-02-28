package assignment11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests the operation methods of the Fraction class, including addition, subtraction, multiplication, division and exponentiation.
 */
public class FractionTest {
    // Create some fraction objects

    Fraction a = new Fraction(1, 2);
    Fraction b = new Fraction(1, 6);
    Fraction c = new Fraction(3, 5);

    // Create fractions as the result of computation

    int x = 7;
    int y = x + 1;
    Fraction d = new Fraction(x, y);
    Fraction e = new Fraction(x-3, y+1);

    // Unit testing

    @Test
    public void addTest() throws Exception {
        // Perform computations
        Fraction add_test_1 = a.add(b);
        Fraction add_test_2 = c.add(e);

        // Evaluate results
        assertEquals("2/3", add_test_1.to_string());
        assertEquals("47/45", add_test_2.to_string());
    }

    @Test
    public void subtractTest() throws Exception {
        // Perform computations
        Fraction sub_test_1 = d.subtract(b);
        Fraction sub_test_2 = a.subtract(e);

        // Evaluate results
        assertEquals("17/24", sub_test_1.to_string());
        assertEquals("1/18", sub_test_2.to_string());
    }

    @Test
    public void multiplyTest() throws Exception {
        // Perform computations
        Fraction mul_test_1 = b.multiply(c);
        Fraction mul_test_2 = d.multiply(e);

        // Evaluate results
        assertEquals("1/10", mul_test_1.to_string());
        assertEquals("7/18", mul_test_2.to_string());
    }

    @Test
    public void divideTest() throws Exception {
        // Perform computations
        Fraction div_test_1 = d.divide(a);
        Fraction div_test_2 = c.divide(b);

        // Evaluate results
        assertEquals("7/4", div_test_1.to_string());
        assertEquals("18/5", div_test_2.to_string());
    }

    @Test
    public void powerTest() throws Exception {
        // Perform computations
        Fraction pow_test_1 = e.power(3);
        Fraction pow_test_2 = b.power(-4);
        Fraction pow_test_3 = c.power(0);

        // Evaluate results
        assertEquals("64/729", pow_test_1.to_string());
        assertEquals("1296", pow_test_2.to_string());
        assertEquals("1", pow_test_3.to_string());
    }
}