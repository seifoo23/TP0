import org.example.Matrix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    @Test
    public void testAddWithNullMatrix() {
        Matrix matrix1 = new Matrix(3);
        assertThrows(NullPointerException.class, () -> {
            matrix1.add(null);
        });
    }

    @Test
    public void testAddWithDifferentSizes() {
        Matrix matrix1 = new Matrix(3);
        Matrix matrix2 = new Matrix(4);
        assertThrows(IllegalArgumentException.class, () -> {
            matrix1.add(matrix2);
        });
    }


    @Test
    public void testAdd() {
        Matrix matrix1 = new Matrix(3);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(0, 2, 3);
        matrix1.set(1, 0, 4);
        matrix1.set(1, 1, 5);
        matrix1.set(1, 2, 6);
        matrix1.set(2, 0, 7);
        matrix1.set(2, 1, 8);
        matrix1.set(2, 2, 9);

        Matrix matrix2 = new Matrix(3);
        matrix2.set(0, 0, 9);
        matrix2.set(0, 1, 8);
        matrix2.set(0, 2, 7);
        matrix2.set(1, 0, 6);
        matrix2.set(1, 1, 5);
        matrix2.set(1, 2, 4);
        matrix2.set(2, 0, 3);
        matrix2.set(2, 1, 2);
        matrix2.set(2, 2, 1);

        matrix1.add(matrix2);

        assertEquals(10, matrix1.get(0, 0));
        assertEquals(10, matrix1.get(0, 1));
        assertEquals(10, matrix1.get(0, 2));
        assertEquals(10, matrix1.get(1, 0));
        assertEquals(10, matrix1.get(1, 1));
        assertEquals(10, matrix1.get(1, 2));
        assertEquals(10, matrix1.get(2, 0));
        assertEquals(10, matrix1.get(2, 1));
        assertEquals(10, matrix1.get(2, 2));
    }

    @Test
    public void testMultiplyWithNullMatrix() {
        Matrix matrix1 = new Matrix(3);
        assertThrows(NullPointerException.class, () -> {
            matrix1.multiply(null);
        });
    }

    @Test
    public void testMultiplyWithDifferentSizes() {
        Matrix matrix1 = new Matrix(3);
        Matrix matrix2 = new Matrix(4);
        assertThrows(IllegalArgumentException.class, () -> {
            matrix1.multiply(matrix2);
        });
    }

    @Test
    public void testMultiply() {
        Matrix matrix1 = new Matrix(3);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(0, 2, 3);
        matrix1.set(1, 0, 4);
        matrix1.set(1, 1, 5);
        matrix1.set(1, 2, 6);
        matrix1.set(2, 0, 7);
        matrix1.set(2, 1, 8);
        matrix1.set(2, 2, 9);

        Matrix matrix2 = new Matrix(3);
        matrix2.set(0, 0, 9);
        matrix2.set(0, 1, 8);
        matrix2.set(0, 2, 7);
        matrix2.set(1, 0, 6);
        matrix2.set(1, 1, 5);
        matrix2.set(1, 2, 4);
        matrix2.set(2, 0, 3);
        matrix2.set(2, 1, 2);
        matrix2.set(2, 2, 1);

        matrix1.multiply(matrix2);

        assertEquals(30, matrix1.get(0, 0));
        assertEquals(24, matrix1.get(0, 1));
        assertEquals(18, matrix1.get(0, 2));
        assertEquals(84, matrix1.get(1, 0));
        assertEquals(69, matrix1.get(1, 1));
        assertEquals(54, matrix1.get(1, 2));
        assertEquals(138, matrix1.get(2, 0));
        assertEquals(114, matrix1.get(2, 1));
        assertEquals(90, matrix1.get(2, 2));
    }

    @Test
    public void testTranspose() {
        Matrix matrix = new Matrix(3);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(0, 2, 3);
        matrix.set(1, 0, 4);
        matrix.set(1, 1, 5);
        matrix.set(1, 2, 6);
        matrix.set(2, 0, 7);
        matrix.set(2, 1, 8);
        matrix.set(2, 2, 9);

        matrix.transpose();

        assertEquals(1, matrix.get(0, 0));
        assertEquals(4, matrix.get(0, 1));
        assertEquals(7, matrix.get(0, 2));
        assertEquals(2, matrix.get(1, 0));
        assertEquals(5, matrix.get(1, 1));
        assertEquals(8, matrix.get(1, 2));
        assertEquals(3, matrix.get(2, 0));
        assertEquals(6, matrix.get(2, 1));
        assertEquals(9, matrix.get(2, 2));
    }

    @Test
    public void testToString() {
        Matrix matrix = new Matrix(2);
        matrix.set(0, 0, 1);
        matrix.set(0, 1, 2);
        matrix.set(1, 0, 3);
        matrix.set(1, 1, 4);

        String expected = "[1, 2]\n[3, 4]\n";
        assertEquals(expected, matrix.toString());
    }
}
