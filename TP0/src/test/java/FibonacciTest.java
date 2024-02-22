import org.example.Fibonacci;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class FibonacciTest {

    @Test
    public void shouldreturnexecptionifvalueisnegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
    }

    @Test
    public void shouldbereturnzeroifvalueisequalstozeros() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void shouldBereturnvalueone() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void shouldberetrunthecorrectvalue() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        //assertEquals(2, Fibonacci.fibonacci(4));
        //assertEquals(3, Fibonacci.fibonacci(5));
        // Add more test cases for positive input as needed
    }
}

