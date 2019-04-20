package questao1.interfaces;

import java.util.List;

public interface ICommand 
{
    public void redo(List<IOperacao> operacoes, IOperacao operacao);
    public void undo(List<IOperacao> operacoes);
}
