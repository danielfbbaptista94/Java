package questao2.leafs;

import questao2.interfaces.IComponent;

public class Quadrado extends IComponent
{

    @Override
    public void show() 
    {
        System.out.println("Show Quadrado");
    }

    @Override
    public void hide() 
    {
        System.out.println("Hide Quadrado");
    }
    
}
