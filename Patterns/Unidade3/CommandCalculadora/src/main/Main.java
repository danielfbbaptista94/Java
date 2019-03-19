package main;

import classes.Invoker;

public class Main 
{
    public static void main(String[] args) 
    {
        Invoker ik = new Invoker();
        
        ik.undo(2);
        ik.computar("+", 10);
        ik.computar("-", 2);
        ik.computar("*", 10);
        ik.computar("/", 10);
        ik.undo(1);
        ik.redo(1);
        ik.undo(6);
        ik.redo(1);
    }
}
