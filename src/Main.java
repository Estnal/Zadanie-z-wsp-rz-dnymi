public class Main {
    double test(Line parametr) {
        return (parametr.getLength());
    }

    boolean canBuildTriangle(Point point1, Point point2, Point point3) {
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);
        Line line3 = new Line(point3, point1);
        return (line1.getLength() + line2.getLength() == line3.getLength() || line1
                .getLength() + line3.getLength() == line2.getLength() || line2.getLength() + line3.getLength() == line1.getLength());

    }


}
