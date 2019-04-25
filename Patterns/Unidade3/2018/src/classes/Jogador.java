/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.IPlayer;
import interfaces.Inimigo;

/**
 *
 * @author Aluno
 */
public class Jogador implements IPlayer{
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void update(Inimigo inimigo, String acao) {
        System.out.println(nome + " perseguindo " + acao);
    }
    
}
