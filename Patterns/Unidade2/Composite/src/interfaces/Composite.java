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
    public boolean addProduct(Component product)
    {
        return (!this.childrens.equals(product)) ? this.childrens.add(product) : false;
    }
    
    @Override
    public boolean removeProduct(Component product)
    {
        return this.childrens.remove(product);
    }

    @Override
    public void changePrice(double newValue) {
        for(Component product : this.childrens)
        {
            product.changePrice(newValue);
        }
    }

    @Override
    public void changeUniquePrice(String name, double newValue) {
        for(Component product : this.childrens)
        {
            if(product.name.equalsIgnoreCase(name))
            {
                product.changeUniquePrice(name, newValue);
            }
        }
    }

    @Override
    public void showValues() {
        for(Component product : this.childrens){
            product.showValues();
        }
    }
}
