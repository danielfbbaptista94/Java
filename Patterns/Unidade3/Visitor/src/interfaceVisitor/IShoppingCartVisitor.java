package interfaceVisitor;

import classes.Book;
import classes.Fruit;

public interface IShoppingCartVisitor 
{
    public int visit(Book book);
    public int visit(Fruit fruit);
}
