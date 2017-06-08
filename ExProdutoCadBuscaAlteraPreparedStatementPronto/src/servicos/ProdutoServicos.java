/*
 * To change this template, choose Tools | Templates
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
        /* Busca da Fábrica um obj. ProdutoDAO */
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        /* Chamando método cadastrar 
         para enviar o obj. pVO */
        pDAO.cadastrarProduto(pVO);
    }

    public ArrayList<ProdutoVO> buscarProdutos() throws SQLException {
        /* Busca da Fábrica um obj. ProdutoDAO */
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();

        /* Retornando o ArrayList de produtos */
        return pDAO.buscarProdutos();
    }

    public void alterarProduto(ProdutoVO pVO) throws SQLException {
        ProdutoDAO pDAO = DAOFactory.getProdutoDAO();
        pDAO.alterarProduto(pVO);
    }
}
