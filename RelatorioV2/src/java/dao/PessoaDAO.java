package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pessoa;

public class PessoaDAO implements IPessoaDAO
{
    private Connection connPost;
    private Connection connMySQL;
    
    public PessoaDAO() throws ClassNotFoundException, SQLException
    {
        this.connPost = ConexaoPostegre.getInstancia().getConnection();
        this.connMySQL = ConexaoMySQL.getInstancia().getConnection();
    }
    
    @Override
    public ArrayList<Pessoa> listarPessoasPostgre() throws Exception 
    {
        ArrayList<Pessoa> lista = new ArrayList<>();
        PreparedStatement st = ConexaoPostegre.getInstancia().getConnection().prepareStatement("select * from pessoas");
        ResultSet rs = st.executeQuery();
        
        while(rs.next())
        {
            Pessoa p = new Pessoa();
            p.setId(rs.getInt("id"));
            p.setCpf(rs.getString("cpf"));
            p.setData_nascimento(rs.getDate("data_nascimento"));
            p.setEndereco(rs.getString("endereco"));
            lista.add(p);
        }
        return lista;
    }

    @Override
    public ArrayList<Pessoa> listarPessoasMySql() throws Exception 
    {
        ArrayList<Pessoa> lista = new ArrayList<>();
        PreparedStatement st = ConexaoMySQL.getInstancia().getConnection().prepareStatement("select * from pessoas.pessoas");
        ResultSet rs = st.executeQuery();
        
        while(rs.next())
        {
            Pessoa p = new Pessoa();
            p.setId(rs.getInt("id"));
            p.setCpf(rs.getString("cpf"));
            p.setNome(rs.getString("nome"));
            lista.add(p);
        }
        return lista;
    }
}
