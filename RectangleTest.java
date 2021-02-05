import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void calculateLength() {
        Double length1 = Rectangle.calculateLength(0d, 0d, 0d, 5d);
        assertEquals(length1, 5);

        for (double i = -100d; i < 100; ++i) {
            for (double j = -100d; j < 100; ++j) {
                Double length = Rectangle.calculateLength(i, j, i - j, i + j);
                assertEquals(length, Math.sqrt(j * j + i * i), 0.001);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void calculateArea() {
        Rectangle rect = new Rectangle(new Double[]{0d, -1d, 0d, 1d}, new Double[]{0d, 1d, 2d, 1d});
        assertEquals(rect.calculateArea(), 2, 0.01);

        for (double i = -100d; i < 100; ++i) {
            for (double j = -100d; j < 100; ++j) {
                rect = new Rectangle(new Double[]{i, i + 10, i - 90, i - 100}, new Double[]{j, j - 10, j - 110, j - 100});
                assertEquals(rect.calculateArea(), 2000, 0.01);
            }
        }
    }
}