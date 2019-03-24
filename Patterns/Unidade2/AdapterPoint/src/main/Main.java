package main;

import interfaces.IShape;
import java.util.ArrayList;
import line.Line;
import line.LineAdapter;
import square.Square;
import square.SquareAdapter;

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<IShape> shapes = new ArrayList<>();
        shapes.add(new LineAdapter(new Line()));
        shapes.add(new SquareAdapter(new Square()));
        shapes.add(new LineAdapter(new Line()));

        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 40;
        
        for (IShape shape : shapes) 
        {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
