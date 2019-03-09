package controller;

import dao.IPessoaDAO;
import dao.PessoaDAO;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import model.Pessoa;

@ManagedBean(name = "pessoaBean")
@ApplicationScoped
public class PessoaBean
{
    private Pessoa pessoa;
    private IPessoaDAO dao;

    public PessoaBean() throws ClassNotFoundException, SQLException 
    {
        this.pessoa = new Pessoa();
        this.dao = new PessoaDAO();
    }
    
    public List<Pessoa> getPessoasP() throws Exception
    {
        return this.dao.listarPessoasPostgre(pessoa);
    }
    
    public List<Pessoa> getPessoasMySQL() throws Exception
    {
        return this.dao.listarPessoasMySql(pessoa);
    }
    
    public Pessoa getPessoa()
    {
        return this.pessoa;
    }
}
