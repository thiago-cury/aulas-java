/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ConexaoBanco {
 
    private static final String URL="jdbc:mysql://localhost:3306/XXXX";
    private static final String USUARIO="XXXX";
    private static final String SENHA="XXXX";

    public static Connection getConexao() throws SQLException{
        
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) { 
            throw new SQLException("Erro ao conectar no Banco de Dados! "+se.getMessage());
        }
        
        return c;
    }
}
