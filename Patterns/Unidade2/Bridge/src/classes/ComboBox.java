package classes;

import interfaces.Widget;

public class ComboBox extends Widget
{
    @Override
    public void show() 
    {
        backend.drawnLine();
        backend.drawnText();
        System.out.println("ComboBox");
    }
}
