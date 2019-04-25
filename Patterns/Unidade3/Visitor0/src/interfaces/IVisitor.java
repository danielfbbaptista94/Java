/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import elementes.Professor;
import elementes.Aluno;

/**
 *
 * @author Aluno
 */
public interface IVisitor {
    public void visitAluno(Aluno a);
    public void visitProfessor(Professor p);
}
