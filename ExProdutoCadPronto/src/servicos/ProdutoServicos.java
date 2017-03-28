/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicos;

import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import modelo.Produto;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ProdutoServicos {
    
    public void cadastrarProduto(Produto p) throws SQLException{
        
        /* Busca da Fábrica(Factory) um obj. ProdutoDAO */
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        /* Chamando método cadastrar para
           enviar o obj. "p" */
        pDAO.cadastrarProduto(p);
    }
}//fecha classe
