package comparable;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        } else
            return 0;
    }

    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[2];

        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.5, "blue", true);

        Arrays.sort(circles);

        System.out.println("After-sorted :");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
