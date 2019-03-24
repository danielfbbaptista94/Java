package main;

import interfaces.Composite;
import objects.Circle;
import objects.Rectangle;

public class Main 
{
    public static void main(String[] args) 
    {
        Composite grafics = new Composite("Objetos Poligonais");
        grafics.addObject(new Rectangle("Retangulo"));
        grafics.addObject(new Circle("Circulo"));
        
        grafics.turnRight();
    }
    
}
