package objects;

import interfaces.Component;

public class Circle extends Component
{
    private double valueX;
    private double valueY;
    private double size;
    
    public Circle(String name) 
    {
        super(name);
        valueX = 0;
        valueY = 0;
        size = 50;
    }

    @Override
    public void turnRight() 
    {
        System.out.println("Turn Right");
    }

    @Override
    public void turnLeft() 
    {
        System.out.println("Turn Left");
    }

    @Override
    public void increaseSize(int percent) 
    {
        this.size = percent;
    }

    @Override
    public void decreaseSize(int percent) 
    {
        this.size = percent;
    }
}
