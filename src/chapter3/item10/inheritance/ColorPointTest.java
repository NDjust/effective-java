package chapter3.item10.inheritance;

import chapter3.item10.Point;

import java.util.Set;

// CounterPoint 를 Point로 사용하는 테스트 프로그램
public class ColorPointTest {

    private static final Set<Point> unitCircle = Set.of(
            new Point( 1,  0), new Point( 0,  1),
            new Point(-1,  0), new Point( 0, -1));

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 0);
        Point p2 = new CounterPoint(1, 0);

        // true 출력
        System.out.println(onUnitCircle(p1));

        // true 를 출력해야 하지만, Point의 equals 가 getClass 를 사용해 작성되었다면 그렇지 않음.
        System.out.println(onUnitCircle(p2));
    }
}
