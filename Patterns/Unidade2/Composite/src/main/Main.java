package main;

import interfaces.Composite;
import products.Cookie;
import products.Fish;

public class Main 
{
    public static void main(String[] args) 
    {
        Composite market = new Composite("Cadastro Produtos");
        market.addProduct(new Fish("Sardinha", 2.20));
        market.addProduct(new Fish("Bacalhau", 14.20));
        market.addProduct(new Cookie("Cookie", 9.20));
        market.addProduct(new Cookie("Creme-Craque", 3.26));
        
        market.changeUniquePrice("Cookie", 5.99);
        market.showValues();
    }
}
