package relatorios;

import classes.Aluno;
import interfaces.Relatorio;
import java.util.ArrayList;

public class AlunoRelatorio extends Relatorio
{
    private ArrayList<Aluno> alunos;

    public AlunoRelatorio() 
    {
        alunos = new ArrayList<>();
    }
    
    public void addAlunos(Aluno a)
    {
        alunos.add(a);
    }

    @Override
    protected void gerarCorpo() 
    {
        System.out.println("Relatorio de Alunos Matriculados\n");
        for(Aluno a : alunos)
        {
            a.dados();
        }
    }
}
