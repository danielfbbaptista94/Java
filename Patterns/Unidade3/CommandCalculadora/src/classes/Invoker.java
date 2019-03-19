package classes;

import interfaces.ICommand;
import java.util.ArrayList;

public class Invoker 
{
    private int numerop;
    private Calculadora calculadora;
    private ArrayList<ICommand> commands;

    public Invoker() 
    {
        numerop = 0;
        calculadora = new Calculadora();
        commands = new ArrayList<>();
    }
    
    public void redo(int posicao)
    {
        for (int i = 0; i < posicao; i++)
        {
            if(numerop < commands.size())
            {
                ICommand c = commands.get(numerop++);
                c.redo();
            }
            else{
                System.out.println("Não pode fazer a operação");
            }
        }
    }
    
    public void undo(int posicao)
    {
        for (int i = 0; i < posicao; i++)
        {
            if(numerop > 0)
            {
                ICommand c = commands.get(--numerop);
                c.undo();
            }
            else{
                System.out.println("Não pode fazer a operação");
            }
        }
    }
    
    public void computar(String operacao, int numero)
    {
        //Cria a operação command e executa
        ICommand c = new Command(operacao, numero, calculadora);
        c.redo();
        
        //add a operação command no ARRAY
        commands.add(c);
        numerop++;
    }
}
