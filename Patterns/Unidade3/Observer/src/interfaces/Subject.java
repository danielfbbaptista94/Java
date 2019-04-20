package interfaces;

import java.util.ArrayList;

public class Subject 
{
    private ArrayList<IObserver> observers = new ArrayList<>();
    
    public void addObserver(IObserver observer)
    {
        this.observers.add(observer);
    }
    
    public void removeObserver(IObserver observer)
    {
        this.observers.remove(observer);
    }
    
    public void notifyObservers()
    {
        for(IObserver observer : this.observers)
        {
            observer.update(this);
        }
    }
}
