package main;

import classes.Fruta;
import interfaces.IComponent;
import interfaces.Composite;

public class Main
{
    public static void main(String[] args) 
    {
        IComponent frutas = new Composite();
        
        IComponent cajus= new Composite(frutas);
        IComponent cajusVerdes = new Composite(cajus);
        
        
        IComponent mangas = new Composite(frutas);
        IComponent mangasVerdes = new Composite(mangas);
        
        
        Fruta caju = new Fruta("Caju", "madura", "medio", cajusVerdes);
        Fruta cajuGrande = new Fruta("Caju", "madura", "grande", cajusVerdes);
        Fruta manga = new Fruta("Manga", "verde", "pequeno", mangasVerdes);
        Fruta mangaGrande = new Fruta("Manga", "verde", "grande", mangasVerdes);
        
        cajusVerdes.addFruta(caju);
        cajus.addFruta(cajusVerdes);
        cajus.addFruta(cajuGrande);
        mangasVerdes.addFruta(manga);
        mangasVerdes.addFruta(mangaGrande);
        mangas.addFruta(mangasVerdes);
        frutas.addFruta(cajus);
        frutas.addFruta(mangas);
        
        //frutas.getChild("Manga").limparFrutas();
        //cajus.limparFrutas();
        cajusVerdes.getChild("grande").limparFrutas();
        mangasVerdes.getChild("verde").limparFrutas();
    }
}
