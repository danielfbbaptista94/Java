package classes;

import interfaces.Widget;

public class Modal extends Widget
{
    @Override
    public void show() 
    {
        backend.drawnLine();
        backend.drawnText();
        System.out.println("Modal");
    }
}
