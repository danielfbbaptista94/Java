package main;

import classes.Book;
import classes.Fruit;
import interfaceVisitor.IShoppingCartVisitor;
import interfaces.IItemElement;
import visitor.ShoppingCartVisitor;

public class Main 
{
    public static void main(String[] args) 
    {
        IItemElement[] itens = new IItemElement[]{new Book(20, "0123"),
                                                  new Book(100, "3456"),
                                                  new Fruit(10, 2, "banana"),
                                                  new Fruit(5, 5, "maçã")};
        
        int total = calculatePrice(itens);
        System.out.println("Total = " + total);
    }
    
    private static int calculatePrice(IItemElement[] itens)
    {
        IShoppingCartVisitor visitor = new ShoppingCartVisitor();
        int sum = 0;
        
        for(IItemElement item : itens)
            sum += item.accept(visitor);
        
        return sum;
    }
}
