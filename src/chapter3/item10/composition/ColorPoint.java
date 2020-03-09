package chapter3.item10.composition;

import chapter3.item10.Color;
import chapter3.item10.Point;

public class ColorPoint  {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    /**
     * Color Point 의 Point 뷰를 반환
     *
     */
    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;

        return cp.point.equals(point) &&  cp.color.equals(color);
    }

    @Override
    public int hashCode() {
        return 31 * point.hashCode() + color.hashCode();
    }
}
