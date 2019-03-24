package decorators;

import interfaces.Decorator;
import interfaces.IVisual;

public class Scroll extends Decorator
{
    public Scroll(IVisual visual) 
    {
        super(visual);
    }
    
    @Override
    public void draw()
    {
        super.draw();
        System.out.println("Draw Scroll");
    }
}
