package questao1.observers;

import questao1.interfaces.IObserver;
import questao1.interfaces.IOperacao;
import questao1.interfaces.ISubject;

public class Supervisor implements IObserver
{
    private ISubject operacao;

    public Supervisor(ISubject operacao) 
    {
        this.operacao = operacao;
    }
    
    @Override
    public void update(ISubject operacao) 
    {
        IOperacao operation = (IOperacao) operacao;
        System.out.println("Supervisor Operacao Realizada");
    }
}
