/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import elementes.Aluno;
import elementes.Professor;
import interfaces.IElement;
import interfaces.IVisitor;
import visitors.VisitorEstatisticas;
import visitors.VisitorHorasSono;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void mostarDados()
    {
        IElement[] elements = new IElement[]{new Aluno("Daniel", 5, 6),
                                            new Professor(10, "Sandro", 6),
                                            new Aluno("Marcus", 9, 8),
                                            new Professor(10, "Manoel", 6),
                                            new Aluno("Jonatoas", 10, 5)};
        
        IVisitor[] visitors = new IVisitor[]{new VisitorEstatisticas(),
                                                new VisitorHorasSono()};
        
        for(IElement element : elements) {
            for(IVisitor visitor : visitors) {
                element.accept(visitor);
            }
        }
    }
    
    public static void main(String[] args) {
        mostarDados();
    }  
}
