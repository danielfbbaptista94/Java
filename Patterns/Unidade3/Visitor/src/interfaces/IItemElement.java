package interfaces;

import interfaceVisitor.IShoppingCartVisitor;

public interface IItemElement 
{
    public int accept(IShoppingCartVisitor visitor);
}
