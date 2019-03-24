package interfaces;

import java.util.ArrayList;

public class Composite extends Component
{
    private ArrayList<Component> childrens;
    
    public Composite(String name) 
    {
        super(name);
        this.childrens = new ArrayList<Component>();
    }
    
    @Override
    public boolean addObject(Component component)
    {
        return (!this.childrens.equals(component)) ? this.childrens.add(component) : false;
    }
    
    @Override
    public boolean removeObject(Component component)
    {
        return this.childrens.remove(component);
    }

    @Override
    public void turnRight() 
    {
        for (Component component : this.childrens)
        {
            component.turnRight();
        }
    }

    @Override
    public void turnLeft() 
    {
        for (Component component : this.childrens)
        {
            component.turnLeft();
        }
    }

    @Override
    public void increaseSize(int percent) 
    {
        for (Component component : this.childrens)
        {
            component.increaseSize(percent);
        }
    }

    @Override
    public void decreaseSize(int percent) 
    {
        for (Component component : this.childrens)
        {
            component.decreaseSize(percent);
        }
    }
}
