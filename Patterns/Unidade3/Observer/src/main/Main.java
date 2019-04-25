package main;

import interfaces.IObserver;
import observers.Aluno;
import subjects.Professor;

public class Main 
{
    public static void main(String[] args) 
    {
        Professor sandro = new Professor("Sandro");
        
        IObserver daniel = new Aluno(sandro);
        
        sandro.addObserver(daniel);
        sandro.setDataProva("22/04/2019");
        //sandro.removeObserver(daniel);
        sandro.setDataProva("25/04/2019");
    }
}
