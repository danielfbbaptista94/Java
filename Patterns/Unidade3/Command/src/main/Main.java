package main;

import classes.Pessoa;
import command.Command;
import interfaces.ICommand;
import invoker.Invoker;
import receiver.Mensagem;

public class Main 
{
    public static void main(String[] args) 
    {
        Mensagem m1 = new Mensagem(new Pessoa("Daniel"), new Pessoa("Miguel"));
        Mensagem m2 = new Mensagem(new Pessoa("Miguel"), new Pessoa("Raphael"));
        
        Invoker invoker = new Invoker();
        
        invoker.storeAndExecute(new Command(m2));
        invoker.storeAndExecute(new Command(m1));
        
        invoker.unexecute();
        invoker.unexecute();
        
    }
}
