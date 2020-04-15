public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean firstQuarter() {
        return (x > 0 && y > 0);
    }

    boolean secondQuarter() {
        return (x < 0 && y > 0);
    }

    boolean thirdQuarter() {
        return (x < 0 && y < 0);
    }

    boolean fourthQuarter() {
        return (x > 0 && y < 0);
    }


    boolean isOnXAxis() {
        return (y == 0);
    }
    boolean isOnYAxis(){
        return (x == 0);
    }
    boolean isOnCenter(){
        return (x == 0 && y == 0);
    }


}
