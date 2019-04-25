/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementes;

import interfaces.IElement;
import interfaces.IVisitor;

/**
 *
 * @author Aluno
 */
public class Professor implements IElement{
    private String nome;
    private int publicacoes;
    private int horasTrabalho;

    public Professor(int publicacoes, String nome, int horasTrabalho) {
        this.nome = nome;
        this.publicacoes = publicacoes;
        this.horasTrabalho = horasTrabalho;
    }
    
    @Override
    public void accept(IVisitor v) {
        v.visitProfessor(this);
    }

    public int getPublicacoes() {
        return publicacoes;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public String getNome() {
        return nome;
    }
}
