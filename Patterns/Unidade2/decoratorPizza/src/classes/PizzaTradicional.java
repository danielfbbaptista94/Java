package classes;

import interfaces.IPizza;

public class PizzaTradicional implements IPizza
{
    @Override
    public void assar() {
        System.out.print("Massa + Molho + Queijo | ");
    }
}
