package run;

import interfaces.IBackend;
import interfaces.Widget;
import linux.BELinux;
import windows.BEWindowns;

public class Run 
{
    public static void main(String[] args) 
    {
        Widget widget = new ComboBox();
        IBackend backend = new BELinux();
        
        widget.setBackend(backend);
        widget.show();
    }
}
