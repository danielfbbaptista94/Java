package ingredientes;

import interfaces.*;

public class Calabresa extends Decorator
{
    public Calabresa(IPizza pizza)
    {
        super(pizza);
    }
    
    @Override
    public void assar() 
    {
        super.assar();
        System.out.print("+ Calabresa | ");
    }
}
