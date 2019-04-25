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
public class VisitorHorasSono implements IVisitor{
    private String nome;
    private int horas;
    
    @Override
    public void visitAluno(Aluno a) {
        nome = a.getNome();
        horas = a.getHorasSono();
        System.out.println("Aluno " + nome + " dorme " + horas + " horas por dia!");
    }

    @Override
    public void visitProfessor(Professor p) {
        nome = p.getNome();
        horas = p.getHorasTrabalho();
        System.out.println("Professor " + nome + " trabalha " + horas +" horas!");
    }
    
}
