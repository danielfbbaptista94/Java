package products;

import interfaces.Component;

public class Fish extends Component
{
    private double fishValue;
    
    public Fish(String name, double fishValue) 
    {
        super(name);
        this.fishValue = fishValue;
    }

    @Override
    public void changePrice(double newValue) 
    {
        this.fishValue = newValue;
    }

    @Override
    public void changeUniquePrice(String name, double newValue) 
    {
        if(super.name.equals(name))
        {
            this.fishValue = newValue;
        }
    }

    @Override
    public void showValues() {
        System.out.println("Fish: " + this.name + ", Value: " + this.fishValue);
    }
}
