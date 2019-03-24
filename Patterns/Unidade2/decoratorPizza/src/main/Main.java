package main;

import classes.PizzaTradicional;
import ingredientes.Calabresa;
import interfaces.IPizza;

public class Main 
{
    public static void main(String[] args) 
    {
        IPizza tradicional = new PizzaTradicional();
        IPizza calabresa = new Calabresa(tradicional);
        calabresa.assar();
    }
}
