package questao2.leafs;

import questao2.interfaces.IComponent;

public class Retangulo extends IComponent
{
    @Override
    public void show() 
    {
        System.out.println("SHOW Retangulo");
    }

    @Override
    public void hide() 
    {
        System.out.println("HIDE Retangulo");
    }
}
