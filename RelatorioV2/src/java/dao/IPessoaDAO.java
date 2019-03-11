package dao;

import java.util.ArrayList;
import model.Pessoa;

public interface IPessoaDAO 
{
    public ArrayList<Pessoa> listarPessoasMySql() throws Exception;
    public ArrayList<Pessoa> listarPessoasPostgre() throws Exception;
}
