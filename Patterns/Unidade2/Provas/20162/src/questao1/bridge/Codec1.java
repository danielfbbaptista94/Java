package questao1.bridge;

import questao1.interfaces.ICodec;

public class Codec1 implements ICodec
{
    @Override
    public void reproduziar() 
    {
        System.out.println("Usando codec1");
    }
}
