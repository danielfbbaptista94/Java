package quetao1.composite;

import quetao1.interfaces.IComponent;
import java.util.ArrayList;

public class Composite extends IComponent
{
    public Composite() 
    {
        children = new ArrayList<>();
    }
    
    @Override
    public boolean addChild(IComponent child) 
    {
        children.add(child);
        return true;
    }
    
    @Override
    public boolean removeChild(IComponent child) 
    {
        children.remove(child);
        return true;
    }
    
    @Override
    public void aumentarPreco(double percentual) 
    {
        for(IComponent child: children)
            child.aumentarPreco(percentual);
    }
    
    ArrayList<IComponent> children;
}
