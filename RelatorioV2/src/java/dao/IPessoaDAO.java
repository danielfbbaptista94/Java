package dao;

import java.util.ArrayList;
import model.Pessoa;

public interface IPessoaDAO 
{
    public ArrayList<Pessoa> listarPessoasMySql(Pessoa possoa) throws Exception;
    public ArrayList<Pessoa> listarPessoasPostgre(Pessoa possoa) throws Exception;
}
