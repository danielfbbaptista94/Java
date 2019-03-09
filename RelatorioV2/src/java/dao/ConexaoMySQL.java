package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL 
{
    private static ConexaoMySQL instancia;
    private Connection conn;
    
    public ConexaoMySQL() {}
    
    public static ConexaoMySQL getInstancia()
    {
        if (instancia == null)
        {
            instancia = new ConexaoMySQL();
        }
        return instancia;
    }
    
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        return conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pessoas?useTimezone=true&serverTimezone=UTC", "root", "0123456");
    }
}
