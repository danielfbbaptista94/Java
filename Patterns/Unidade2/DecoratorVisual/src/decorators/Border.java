package decorators;

import interfaces.Decorator;
import interfaces.IVisual;

public class Border extends Decorator
{
    public Border(IVisual visual) {
        super(visual);
    }
    
    @Override
    public void draw()
    {
        super.draw();
        System.out.println("Draw Border");
    }
}
