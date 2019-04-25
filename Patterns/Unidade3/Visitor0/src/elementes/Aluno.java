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
public class Aluno implements IElement{
    private String nome;
    private int nota;
    private int horasSono;

    public Aluno(String nome, int nota, int horasSono) 
    {
        this.nome = nome;
        this.nota = nota;
        this.horasSono = horasSono;
    }
    

    @Override
    public void accept(IVisitor v) {
        v.visitAluno(this);
    }

    public String getNome() {
        return nome;
    }

    public int getHorasSono() {
        return horasSono;
    }

    public int getNota() {
        return nota;
    }
}
