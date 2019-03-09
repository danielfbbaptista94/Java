package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostegre 
{
    private static ConexaoPostegre instancia;
    private Connection conn;
    
    public ConexaoPostegre() {}
    
    public static ConexaoPostegre getInstancia()
    {
        if (instancia == null)
        {
            instancia = new ConexaoPostegre();
        }
        return instancia;
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        return conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pessoas", "postgres", "0123456");
    }
}
