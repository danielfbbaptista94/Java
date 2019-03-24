package questao2.main;

import questao2.classes.Adaptee;
import questao2.classes.Adapter;
import questao2.interfaces.ITarget;

public class Main 
{
    public static void main(String[] args) 
    {
        ITarget target = new Adapter(new Adaptee());
        target.mover(6, 6);
    }
}
