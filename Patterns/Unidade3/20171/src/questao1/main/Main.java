package questao1.main;

import java.util.ArrayList;
import questao1.classes.Deposito;
import questao1.interfaces.IObserver;
import questao1.interfaces.IOperacao;
import questao1.observers.Gerente;
import questao1.observers.Supervisor;

public class Main 
{
    public static void main(String[] args) 
    {
        IOperacao deposito1 = new Deposito();
        
        IObserver gerente = new Gerente(deposito1);
        IObserver supervisor = new Supervisor(deposito1);
        
        //deposito1.addObserver(supervisor);
        deposito1.addObserver(gerente);
        
        ArrayList<IOperacao> operacoes = new ArrayList<>();
        
        deposito1.redo(operacoes, deposito1);
        //deposito1.undo(operacoes);
    }
}
