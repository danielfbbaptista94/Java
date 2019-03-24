package classes;

import interfaces.IVisual;

public class TextView implements IVisual
{
    @Override
    public void draw() {
        System.out.println("Show Text");
    }
}
