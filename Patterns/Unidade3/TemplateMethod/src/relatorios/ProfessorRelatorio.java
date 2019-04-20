package relatorios;

import classes.Professor;
import interfaces.Relatorio;
import java.util.ArrayList;

public class ProfessorRelatorio extends Relatorio
{
    private ArrayList<Professor> professores;
    
    public ProfessorRelatorio() 
    {
        professores = new ArrayList<>();
    }
    
    public void addProfessores(Professor p)
    {
        professores.add(p);
    }

    @Override
    protected void gerarCorpo() 
    {
        System.out.println("Relatorio de Professores\n");
        for(Professor p : professores)
        {
            p.dados();
        }
    }
}
