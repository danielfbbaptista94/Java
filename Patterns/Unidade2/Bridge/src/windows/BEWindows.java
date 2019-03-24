package windows;

import interfaces.IBackend;

public class BEWindows implements IBackend
{
    @Override
    public void drawnLine() 
    {
        System.out.println("----------------");
    }

    @Override
    public void drawnText() 
    {
        System.out.println("Windows");
    }
}
