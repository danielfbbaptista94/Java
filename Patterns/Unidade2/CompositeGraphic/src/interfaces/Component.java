package interfaces;

public abstract class Component 
{
    protected String name;

    public Component(String name) {
        this.name = name;
    }
    
    public boolean addObject(Component product)
    {
        return true;
    }
    
    public boolean removeObject(Component product)
    {
        return true;
    }
    
    public abstract void turnRight();
    public abstract void turnLeft();
    public abstract void increaseSize(int percent);
    public abstract void decreaseSize(int percent);
}
