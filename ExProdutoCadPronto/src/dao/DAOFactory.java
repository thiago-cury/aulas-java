/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class DAOFactory {
    
    /* Instancia um obj. pDAO
       e retorna o mesmo quando solicitado */
    private static final ProdutoDAO PDAO = new ProdutoDAO();
    
    /* Retorna o objeto pDAO */
    public static ProdutoDAO getProdutoDAO(){
        return PDAO;
    }
}//fecha classe
