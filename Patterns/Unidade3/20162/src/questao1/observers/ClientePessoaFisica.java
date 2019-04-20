package questao1.observers;

import questao1.interfaces.ICliente;

public class ClientePessoaFisica extends ICliente
{
    @Override
    protected void saveCliente() 
    {
        System.out.println("Pessoa Fisica foi salva!");
    }
}
