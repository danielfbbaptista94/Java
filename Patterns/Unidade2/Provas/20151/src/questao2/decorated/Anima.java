package questao2.decorated;

import questao2.interfaces.IAnimacao;

public class Anima implements IAnimacao
{
    @Override
    public void animar() 
    {
        System.out.println("Start animação");
    }
}
