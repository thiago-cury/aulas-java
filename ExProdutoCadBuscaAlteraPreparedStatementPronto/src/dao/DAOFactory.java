/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class DAOFactory {
    
    /* Instancia um obj. produtoDAO 
       e retorna o mesmo quando solicitado */
    private static ProdutoDAO produtoDAO = new ProdutoDAO();

    /* Retorna o objeto produtoDAO */
    public static ProdutoDAO getProdutoDAO(){
        return produtoDAO;
    }
}
