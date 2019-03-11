package linux;

import interfaces.IBackend;

public class BELinux implements IBackend
{
    @Override
    public void drawLine() {
        System.out.println("__________");
    }

    @Override
    public void drawText() {
        System.out.println("LINUX");
    }
}
