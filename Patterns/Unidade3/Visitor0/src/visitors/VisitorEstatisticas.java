/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitors;

import elementes.Aluno;
import elementes.Professor;
import interfaces.IVisitor;

/**
 *
 * @author Aluno
 */
public class VisitorEstatisticas implements IVisitor {
    private String nome;
    private int notas;
    private int publicacoes;
    private int contator;

    @Override
    public void visitAluno(Aluno a) {
        notas += a.getNota();
        contator++;
        
        int media = notas/contator;
        
        System.out.println("Media geral dos alunos ficou " + media + " na prova!" + " Numero de alunos: "+ contator);
    }

    @Override
    public void visitProfessor(Professor p) {
        nome = p.getNome();
        publicacoes = p.getPublicacoes();
        System.out.println("Professor " + nome + " publicou " + publicacoes + " artigos!");
    }
    
}
