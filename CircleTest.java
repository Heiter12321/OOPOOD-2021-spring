import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void calculateArea() {
        for (int i = 10; i < 1000; ++i) {
            double radius = Math.random() * i;
            Circle circle = new Circle(radius);
            assertEquals(circle.calculateArea(), Math.PI * radius * radius, 0.00001);
        }
    }
}