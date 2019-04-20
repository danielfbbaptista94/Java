package observers;

import interfaces.IObserver;
import interfaces.Subject;
import subjects.Professor;

public class Aluno implements IObserver
{
    private Subject professor;
    private String data;
    private String nome;

    public Aluno(Subject professor) 
    {
        this.professor = professor;
    }
    
    @Override
    public void update(Subject professor) 
    {
        Professor p = (Professor) professor;
        data = p.getDataProva();
        nome = p.getNome();
        System.out.println("Professor " + nome + ", " + "alterou a prova para a data " + data);
    }
}
