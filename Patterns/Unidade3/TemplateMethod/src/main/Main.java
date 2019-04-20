package main;

import classes.Aluno;
import classes.Coordenador;
import classes.Professor;
import relatorios.AlunoRelatorio;
import relatorios.ProfessorRelatorio;

public class Main 
{
    public static void main(String[] args) 
    {
        Aluno daniel = new Aluno("daniel", "0123456", "25/02/2015");
        Aluno lais = new Aluno("lais", "0123456", "25/02/2015");
        
        AlunoRelatorio alunos = new AlunoRelatorio();
        alunos.addAlunos(lais);
        alunos.addAlunos(daniel);
        
        Professor fabiana = new Professor("Fabiana", "25/02/2009");
        Professor sandro = new Professor("Sandro", "25/02/2009");
        
        ProfessorRelatorio professores = new ProfessorRelatorio();
        professores.addProfessores(fabiana);
        professores.addProfessores(sandro);
        
        Coordenador coordenador = new Coordenador();
        coordenador.setRelatorio(alunos);
        coordenador.solicitarRelatorio();
        System.out.println("");
        coordenador.setRelatorio(professores);
        coordenador.solicitarRelatorio();
    }
}
