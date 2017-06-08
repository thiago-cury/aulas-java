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
import modelo.ProdutoVO;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ProdutoServicos {

    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.cadastrarProduto(pVO);
    }

    public void alterarProduto(ProdutoVO pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.alterarProduto(pVO);
    }
    
    public ArrayList<ProdutoVO> buscarProdutos() throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.buscarProdutos();
    }
    
    public void deletarProduto(long idProduto) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.deletarProduto(idProduto);
    }

    public ArrayList<ProdutoVO> filtrar(String query) throws SQLException{
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        return pDAO.filtrar(query);
    }
}