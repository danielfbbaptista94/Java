package classes;

public class Aluno 
{
    private String nome;
    private String matricula;
    private String dataIngressao;

    public Aluno(String nome, String matricula, String dataIngressao) 
    {
        this.nome = nome;
        this.matricula = matricula;
        this.dataIngressao = dataIngressao;
    }

    public void dados() 
    {
        System.out.println("Nome: " + nome + ", Matricula: " + matricula + ", Data Ingressão: " + dataIngressao);
    }
}
