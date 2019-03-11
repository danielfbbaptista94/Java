package main;

import classes.Adapter;
import interfaces.ITarget;

public class Main 
{
    public static void main(String[] args) 
    {
        ITarget target = new Adapter();
        target.request();
    }
    
}
