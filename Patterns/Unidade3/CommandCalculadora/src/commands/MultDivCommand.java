package commands;

import interfaces.ICommand;
import receiver.Calculadora;

public class MultDivCommand implements ICommand
{
    private Calculadora calculadora;
    private int valor;

    public MultDivCommand(Calculadora calculadora, int valor) 
    {
        this.calculadora = calculadora;
        this.valor = valor;
    }
    @Override
    public void redo() 
    {
        this.calculadora.multiplicar(valor);
    }

    @Override
    public void undo() 
    {
        this.calculadora.dividir(valor);
    }
    
}
