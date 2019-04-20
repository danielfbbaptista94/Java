package questao1.interfaces;

import java.util.List;

public abstract class IOperacao extends ISubject implements ICommand
{
    protected abstract void realizarRedo(List<IOperacao> operacoes, IOperacao operacao);
    protected abstract void realizarUndo(List<IOperacao> operacoes);
    
    @Override
    public void redo(List<IOperacao> operacoes, IOperacao operacao)
    {
        realizarRedo(operacoes, operacao);
        super.notifyObservers();
    }
    
    @Override
    public void undo(List<IOperacao> operacoes)
    {
        realizarUndo(operacoes);
        super.notifyObservers();
    }
}
