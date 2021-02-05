import static java.lang.Math.PI;

public class Circle {
    private final Double radius;

    public Circle(Double r) {
        this.radius = r;
    }

    public Double calculateArea() {
        return PI * Math.pow(this.radius, 2);
    }
}
