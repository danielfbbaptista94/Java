package classes;

public class Professor 
{
    private String nome;
    private String dataIngressao;

    public Professor(String nome, String dataIngressao) {
        this.nome = nome;
        this.dataIngressao = dataIngressao;
    }

    public void dados() {
        System.out.println("Nome: " + nome + ", Data Ingressão: " + dataIngressao);
    }
}
