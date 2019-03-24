package square;

import interfaces.IShape;

public class SquareAdapter implements IShape
{
    private Square adaptee;
    
    public SquareAdapter(Square square)
    {
        this.adaptee = square;
    }
    
    @Override
    public void draw(int x, int y, int x1, int y1) 
    {
        this.adaptee.draw(x, y, x1, y1);
    }
}
