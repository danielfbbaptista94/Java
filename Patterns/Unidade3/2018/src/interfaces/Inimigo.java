/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public abstract class Inimigo {
    
    protected String atualizarJogadores;
    private ArrayList<IPlayer> players = new ArrayList<>();
    
    public void addSubscriber(IPlayer observer)
    {
        this.players.add(observer);
    }
    
    public void removeObserver(IPlayer observer)
    {
        this.players.remove(observer);
    }
            
    public void obterSuperPoderes(int qtd)
    {
        obterPoderes(qtd);
        notifyObservers();
    }
    
    public void notifyObservers()
    {
        for(IPlayer player : this.players)
        {
            player.update(this, atualizarJogadores);
        }
    }
    
    protected abstract void obterPoderes(int qtd);
}
