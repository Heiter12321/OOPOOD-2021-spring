import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateLength() {
        Double length1 = Square.calculateLength(0d, 0d, 0d, 5d);
        assertEquals(length1, 5);

        for (double i = -100d; i < 100; ++i) {
            for (double j = -100d; j < 100; ++j) {
                Double length = Square.calculateLength(i, j, i - j, i + j);
                assertEquals(length, Math.sqrt(j * j + i * i), 0.001);
            }
        }
    }

    @Test
    void calculateArea() {
        Square square = new Square(new Double[]{0d, -1d, 0d, 1d}, new Double[]{0d, 1d, 2d, 1d});
        assertEquals(square.calculateArea(), 2, 0.01);

        for (double i = -100d; i < 100; ++i) {
            for (double j = -100d; j < 100; ++j) {
                square = new Square(new Double[]{i, i + 5, i - 5, i - 10}, new Double[]{j, j - 10, j - 15, j - 5});
                Rectangle rect = new Rectangle(new Double[]{i, i + 5, i - 5, i - 10}, new Double[]{j, j - 10, j - 15, j - 5});
                assertEquals(square.calculateArea(), rect.calculateArea(), 0.01);
            }
        }
    }
}