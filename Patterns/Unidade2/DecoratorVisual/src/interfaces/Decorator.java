package interfaces;

public class Decorator implements IVisual
{    
    private IVisual visual;
    
    public Decorator(IVisual visual)
    {
        this.visual = visual;
    }
    
    @Override
    public void draw() {
        this.visual.draw();
    }
}
