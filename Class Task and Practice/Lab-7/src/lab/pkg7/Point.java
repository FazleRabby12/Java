
package lab.pkg7;

public class Point {
    private int x;
    private int y;
    
    Point()
    {
        
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    public double distance(Point p){
        double dis=Math.sqrt(Math.pow(y-p.y, 2)+Math.pow(x-p.x, 2));
        return dis;
    }
}
