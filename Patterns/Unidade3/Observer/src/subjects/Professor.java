package subjects;

import interfaces.Subject;

public class Professor extends Subject
{
    private String nome;
    private String dataProva;
    
    public void setDataProva(String data) 
    {
        this.dataProva = data;
        super.notifyObservers();
    }

    public Professor(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getDataProva() 
    {
        return dataProva;
    }
}
