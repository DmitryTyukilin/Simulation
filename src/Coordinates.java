import java.util.Objects;

public class Coordinates {
    private Integer x;
    private Integer y;

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }
    public Integer getY() {
        return y;
    }

    public Coordinates getCoordinates() {
        return this;
    }
    public void setX(Integer x) {
       // добавить валидацию на устанавливаему координату
        this.x = x;
    }

    public void setY(Integer y) {
        // добавить валидацию на устанавливаему координату
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
