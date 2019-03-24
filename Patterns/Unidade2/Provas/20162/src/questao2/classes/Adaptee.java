package questao2.classes;

public class Adaptee 
{
    private final int x = 0;
    private final int y = 0;
    
    public void mover(int deltaX, int deltaY)
    {
        int x1 = deltaX - x;
        int y1 = deltaY - y;
        System.out.println("Movido da posição, x: " + x + ", y: " + y + "para a posição, x1: " + x1 + ", y1: " + y1);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
