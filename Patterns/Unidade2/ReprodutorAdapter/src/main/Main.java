package main;

import classes.BluRay;
import classes.VideoAdapter;
import interfaces.IReprodutor;

public class Main 
{
    public static void main(String[] args) 
    {
        IReprodutor r = new VideoAdapter(new BluRay());
        r.reproduzir();
    }
    
}
