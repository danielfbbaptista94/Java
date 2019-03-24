package square;

import java.awt.Point;

public class Square 
{
    public Point point1;
    public Point point2;
    
    public void draw(int x, int y, int x1, int y1)
    {
        this.point1 = new Point(x, y);
        this.point2 = new Point(x1, y1);
        System.out.println("Square: \nPoint1: " + this.point1.x + " " + this.point1.y + ". Point2: " + this.point2.x + " " + this.point2.y);
    }
}
