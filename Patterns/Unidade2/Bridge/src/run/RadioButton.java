package run;

import interfaces.Widget;

public class RadioButton extends Widget
{
    @Override
    public void show() 
    {
        backend.drawLine();
        backend.drawText();
        backend.drawLine();
    }
}
