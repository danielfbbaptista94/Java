package classes;

import interfaceVisitor.IShoppingCartVisitor;
import interfaces.IItemElement;

public class Book implements IItemElement
{
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) 
    {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }
    
    @Override
    public int accept(IShoppingCartVisitor visitor) 
    {
        return visitor.visit(this);
    }

    public int getPrice() 
    {
        return price;
    }

    public String getIsbnNumber() 
    {
        return isbnNumber;
    }
}
