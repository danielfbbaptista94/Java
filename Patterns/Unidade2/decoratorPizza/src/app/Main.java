package app;

import decorators.DecoratorPimenta;
import decorators.DecoratorPresunto;
import interfaces.Component;
import sabores.Traditional;

public class Main {
    public static void main(String[] args) 
    {
        Component traditional = new Traditional();
        Component decoratorPresunto = new DecoratorPresunto(traditional);
        Component decoratorPimenta = new DecoratorPimenta(decoratorPresunto);
        decoratorPimenta.assar();
    }
}
