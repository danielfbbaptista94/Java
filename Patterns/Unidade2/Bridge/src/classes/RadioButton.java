package classes;

import interfaces.Widget;

public class RadioButton extends Widget
{
    @Override
    public void show() 
    {
        backend.drawnLine();
        backend.drawnText();
        System.out.println("RadioButton");
    }
}
