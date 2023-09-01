package geometry;
public class MyPoint {
    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public MyPoint(MyPoint point) {
        this.x = point.getX();
        this.y = point.getY();
    }
      public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }  
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getDistance() {
        return getDistance(new MyPoint(0, 0));
    }    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }    
    public double getAngle() {
        return Math.toDegrees(Math.atan2(y, x));
    }    
    public double getDistance(MyPoint point) {
        double dx = x - point.getX();
        double dy = y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public int getQuadrant() {
        if (x > 0 && y > 0) return 1;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        if (x > 0 && y < 0) return 4;
        if (x == 0 && y == 0) return 0;
        if (x == 0) return 5;
        return 6;
    }
}
