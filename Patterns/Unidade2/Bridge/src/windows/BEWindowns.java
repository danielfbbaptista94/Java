package windows;

import interfaces.IBackend;

public class BEWindowns implements IBackend
{
    @Override
    public void drawLine() {
        System.out.println("__________");
    }

    @Override
    public void drawText() {
        System.out.println("WINDOWNS");
    }
}
