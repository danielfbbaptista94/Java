/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018;

import classes.Jogador;
import classes.PirataInimigo;
import classes.UrsoInimigo;
import interfaces.IPlayer;
import interfaces.Inimigo;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Inimigo inimigo1 = new UrsoInimigo("Urso"); 
        Inimigo inimigo2 = new PirataInimigo("Pirata"); 
        
        IPlayer jogador1 = new Jogador("Jogador 1");
        IPlayer jogador2 = new Jogador("Jogador 2");
        
        
        inimigo1.addSubscriber(jogador1);
        inimigo1.addSubscriber(jogador2);
        inimigo2.addSubscriber(jogador1);
        inimigo2.addSubscriber(jogador2);
        
        
        inimigo1.obterSuperPoderes(10);
        System.out.println("");
        inimigo2.obterSuperPoderes(20);
    }
}
