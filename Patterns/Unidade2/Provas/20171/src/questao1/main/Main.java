package questao1.main;

import questao1.interfaces.Composite;
import questao1.leafs.Camisa;
import questao1.leafs.Leite;

public class Main 
{
    public static void main(String[] args) 
    {
        Composite todosOsProdutos = new Composite();
        Composite laticinios = new Composite();
        Composite vestuario = new Composite();
        Leite l = new Leite(2.0); // Preço = R$ 2.00
        Camisa c = new Camisa(30.0); // Preço = R$ 30.00
        laticinios.addProduto(l);
        vestuario.addProduto(c);
        
        System.out.println("Todos os Produtos");
        todosOsProdutos.addProduto(laticinios);
        todosOsProdutos.addProduto(vestuario);
        todosOsProdutos.aumentarPreco(0.1); // Aumenta todos os produtos em 10%
        
        System.out.println("Preço Laticidios");
        laticinios.aumentarPreco(0.1); // Aumenta somente laticinios em 10%
        
        System.out.println(l.getPreco()); // O preço do leite agora deve ser R$ 2.42
        System.out.println(c.getPreco()); // O preço da camisa agora deve ser R$ 33.0
    }
}
