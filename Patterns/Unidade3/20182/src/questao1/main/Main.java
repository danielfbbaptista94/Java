package questao1.main;

import questao1.interfaces.IObserver;
import questao1.interfaces.ISubject;
import questao1.observers.UberApp;
import questao1.observers.WazeApp;
import questao1.subjects.Acelerometro;
import questao1.subjects.GPS;

public class Main 
{
    public static void main(String[] args) 
    {
        ISubject sensor1 = new Acelerometro();
        ISubject sensor2 = new GPS();
        
        IObserver app1 = new UberApp();
        IObserver app2 = new WazeApp();
        
        sensor1.addSubscriber(app1);
        sensor1.addSubscriber(app2);
        sensor2.addSubscriber(app1);
        sensor2.addSubscriber(app2);
        
        sensor1.collectNewValues();
        System.out.println("");
        sensor2.collectNewValues();
    }
}
