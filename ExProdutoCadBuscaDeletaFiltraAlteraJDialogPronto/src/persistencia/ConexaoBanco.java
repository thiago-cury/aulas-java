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

    //Atributos estáticos com os dados do Banco de Dados
    private static final String URL = "jdbc:mysql://localhost:3306/XXXX";
    private static final String USUARIO = "XXXX";
    private static final String SENHA = "XXXX";

    //Método que efetua a conexão com o MySQL
    public static Connection getConexao() throws SQLException {
        Connection c = null;
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }
        return c;
    }
}