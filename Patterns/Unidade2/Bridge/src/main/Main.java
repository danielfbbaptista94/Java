package main;

import classes.ComboBox;
import classes.Modal;
import interfaces.IBackend;
import interfaces.Widget;
import linux.BELinux;
import windows.BEWindows;

public class Main 
{
    public static void main(String[] args) 
    {
        Widget comboBox = new ComboBox();
        IBackend linux = new BELinux();
        comboBox.setBackend(linux);
        comboBox.show();

        
        Widget modal = new Modal();
        IBackend windows = new BEWindows();
        modal.setBackend(windows);
        modal.show();
    }
}
