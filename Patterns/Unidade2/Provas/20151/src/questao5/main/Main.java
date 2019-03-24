package questao5.main;

import questao5.interfaces.Composite;
import questao5.interfaces.IComponent;
import questao5.leafs.Funcionario;
import questao5.leafs.Gerente;

public class Main 
{
    public static void main(String[] args) 
    {
        IComponent funcionarios = new Composite();

        IComponent gerentes = new Composite(funcionarios);
        IComponent funcionarios2 = new Composite(gerentes);

        Gerente gerenteGeral = new Gerente("Tomas", 6500, funcionarios);
        Gerente gerenteProjetos = new Gerente("Silva", 5000, gerenteGeral);

        Funcionario iago = new Funcionario("Iago", 2500, gerenteProjetos);
        Funcionario beck = new Funcionario("Beck", 2500, gerenteProjetos);
        Funcionario fabiano = new Funcionario("Beck", 3000, gerenteGeral);

        funcionarios2.addEmpregado(iago);
        funcionarios2.addEmpregado(iago);
        funcionarios.addEmpregado(gerentes);
        funcionarios.addEmpregado(funcionarios2);
        
        funcionarios.getSalario();
    }
}
