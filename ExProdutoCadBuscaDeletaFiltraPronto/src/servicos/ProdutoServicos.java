/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Produto;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ProdutoServicos {

    public void cadastrarProduto(Produto pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);
    }

    public ArrayList<Produto> buscarProdutos() throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.buscarProdutos();
    }

    public ArrayList<Produto> filtrar(String query) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.filtrar(query);
    }
    
    public void deletarProduto(long id) throws SQLException{   
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.deletarProduto(id);
    }    
}