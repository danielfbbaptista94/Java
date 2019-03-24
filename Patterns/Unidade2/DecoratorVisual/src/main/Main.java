package main;

import classes.TextView;
import decorators.Border;
import decorators.Scroll;
import interfaces.IVisual;

public class Main 
{
    public static void main(String[] args) 
    {
        IVisual text = new TextView();
        IVisual scroll = new Scroll(text);
        IVisual border = new Border(scroll);
        
        border.draw();
    }
}
