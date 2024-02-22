import org.example.Prime;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    public void testNegativeAndNumbersLessThanTwo() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }

    @Test
    public void testCompositeNumbers() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        // Add more composite numbers as needed
    }

    @Test
    public void testPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        // Add more prime numbers as needed
    }

    @Test
    public void testPerfectSquareOfPrimeNumbers() {
        assertFalse(Prime.isPrime(4)); // 2 * 2
        assertFalse(Prime.isPrime(9)); // 3 * 3
        assertFalse(Prime.isPrime(25)); // 5 * 5
        // Add more perfect square of prime numbers as needed
    }
}
