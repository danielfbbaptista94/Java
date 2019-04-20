package commands;

import interfaces.ICommand;
import receiver.Calculadora;

public class SomaSubCommand implements ICommand
{
    private Calculadora calculadora;
    private int valor;

    public SomaSubCommand(Calculadora calculadora, int valor) 
    {
        this.calculadora = calculadora;
        this.valor = valor;
    }
    
    @Override
    public void redo() 
    {
        this.calculadora.somar(valor);
    }

    @Override
    public void undo() 
    {
        this.calculadora.subtrair(valor);
    }
}
