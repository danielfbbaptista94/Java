package classes;

import interfaceVisitor.IShoppingCartVisitor;
import interfaces.IItemElement;

public class Fruit implements IItemElement
{
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int pricePerKg, int weight, String name) 
    {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }
    
    @Override
    public int accept(IShoppingCartVisitor visitor) 
    {
        return visitor.visit(this);
    }

    public int getPricePerKg() 
    {
        return pricePerKg;
    }

    public int getWeight() 
    {
        return weight;
    }

    public String getName() 
    {
        return name;
    }
}
