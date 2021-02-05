public class Rectangle {
    private final Double[] _x_coordinates;
    private final Double[] _y_coordinates;

    public Rectangle(Double[] x_coordinates, Double[] y_coordinates) {
        this._x_coordinates = x_coordinates;
        this._y_coordinates = y_coordinates;
    };

    public static Double calculateLength(Double x1, Double y1, Double x2, Double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    };

    public Double calculateArea() {
        return calculateLength(this._x_coordinates[0], this._y_coordinates[0],
                               this._x_coordinates[1], this._y_coordinates[1]) *
               calculateLength(this._x_coordinates[1], this._y_coordinates[1],
                               this._x_coordinates[2], this._y_coordinates[2]);
    };
}


