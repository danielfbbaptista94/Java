/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Inimigo;

/**
 *
 * @author Aluno
 */
public class UrsoInimigo extends Inimigo{
    public String nome;

    public UrsoInimigo(String nome) {
        this.nome = nome;
    }
    
    @Override
    protected void obterPoderes(int qtd) {
        System.out.println("Obtendo super-poderes de " + qtd + " mels");
        super.atualizarJogadores = nome + " com " + qtd + " mels";
    }
}
