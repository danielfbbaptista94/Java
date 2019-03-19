package classes;

import interfaces.ICommand;

public class Command implements ICommand
{
    private String operador;
    private int numero;
    private Calculadora calculadora;

    public Command(String operador, int numero, Calculadora calculadora) 
    {
        this.operador = operador;
        this.numero = numero;
        this.calculadora = calculadora;
    }

    @Override
    public void redo() {
        calculadora.operacaoAritmetica(operador, numero);
    }

    @Override
    public void undo() {
        calculadora.operacaoAritmetica(refazer(operador), numero);
    }

    private String refazer(String operador) 
    {
        String refazer = null;
        switch(operador)
        {
            case "+":
                refazer = "-";
                break;
            case "-":
                refazer = "+";
                break;
            case "*":
                refazer = "/";
                break;
            case "/":
                refazer = "*";
                break;
        }
        return refazer;
    }
}
