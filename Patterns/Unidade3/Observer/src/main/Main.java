package main;

import interfaces.IObserver;
import observers.Aluno;
import subjects.Professor;

public class Main 
{
    public static void main(String[] args) 
    {
        Professor Sandro = new Professor("Sandro");
        
        IObserver Daniel = new Aluno(Sandro);
        
        Sandro.addObserver(Daniel);
        Sandro.setDataProva("22/04/2019");
        Sandro.removeObserver(Daniel);
        Sandro.setDataProva("25/04/2019");
    }
}
