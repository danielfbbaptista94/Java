package interfaces;

public abstract class Component 
{
    protected String name;

    public Component(String name) {
        this.name = name;
    }
    
    public boolean addProduct(Component product)
    {
        return true;
    }
    
    public boolean removeProduct(Component product)
    {
        return true;
    }
    
    public abstract void changePrice(double newValue);
    public abstract void changeUniquePrice(String name, double  newValue);
    public abstract void showValues();
}
