package line;

import interfaces.IShape;

public class LineAdapter implements IShape
{
    private Line adaptee;
    
    public LineAdapter(Line line)
    {
        this.adaptee = line;
    }
    
    @Override
    public void draw(int x, int y, int x1, int y1) 
    {
        this.adaptee.draw(x, y, x1, y1);
    }
}
