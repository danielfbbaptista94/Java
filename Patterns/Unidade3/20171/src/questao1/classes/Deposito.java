package questao1.classes;

import java.util.List;
import questao1.interfaces.IOperacao;

public class Deposito extends IOperacao
{
    @Override
    protected void realizarRedo(List<IOperacao> operacoes, IOperacao operacao) 
    {
        operacoes.add(operacao);
        System.out.println("Deposito realizado");
        //super.notifyObservers();
    }

    @Override
    protected void realizarUndo(List<IOperacao> operacoes) 
    {
        operacoes.remove(operacoes.size() - 1);
        System.out.println("Deposito desfeita");
        //super.notifyObservers();
    }
}
