package run;

import interfaces.Widget;

public class ComboBox extends Widget
{
    @Override
    public void show() 
    {
        backend.drawLine();
        backend.drawText();
        backend.drawLine();
    }
}
