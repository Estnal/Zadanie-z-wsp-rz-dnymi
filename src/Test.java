public class Test {
    public static void main(String[] args) {
        Point point = new Point(2, 4);
        Line line = new Line(point, point);
        System.out.println(point.firstQuarter());
        System.out.println(line.getLength());
    }


}
