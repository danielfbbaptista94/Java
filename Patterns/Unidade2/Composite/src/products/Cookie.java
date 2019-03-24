package products;

import interfaces.Component;

public class Cookie extends Component
{
    private double cookieValue;
    
    public Cookie(String name, double cookieValue)
    {
        super(name);
        this.cookieValue = cookieValue;
    }

    @Override
    public void changePrice(double newValue) {
        this.cookieValue = newValue;
    }

    @Override
    public void changeUniquePrice(String name, double newValue) {
        if(super.name.equals(name))
        {
            this.cookieValue = newValue;
        }
    }

    @Override
    public void showValues() {
        System.out.println("Cookie: " + this.name + ", Value: " + this.cookieValue);
    }
    
}
