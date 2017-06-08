/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.ProdutoVO;
import persistencia.ConexaoBanco;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ProdutoDAO {

    //Método cadastrar
    /**
     * @author Thiago Cury
     * @since 25/04/2014
     * @version 1.0
     */
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {
        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        PreparedStatement pstmt = null;
        
        try {
            String sql ="";
            
            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL */
            sql = "insert into produto(idproduto,nome,valorcusto,quantidade)"
                       + "values(null,?,?,?)";

            pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, pVO.getNome());
            pstmt.setDouble(2, pVO.getValorCusto());
            pstmt.setLong(3, pVO.getQuantidade());
            
            //Executando o sql
            pstmt.execute();

        } catch (SQLException se) {
            throw new SQLException("Erro ao inserir dados no Banco de Dados! " + se.getMessage());
        } finally {
            //Encerrando as conexões
            con.close();
            pstmt.close();
        }//fecha finally
    }//fecha método cadastrarProduto

    public ArrayList<ProdutoVO> buscarProdutos() throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //Criando variável sql vazia
            String sql;

            //Montando o sql
            sql = "select * from produto";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<ProdutoVO> produtos = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                ProdutoVO pVO = new ProdutoVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                pVO.setIdProduto(rs.getLong("idproduto"));
                pVO.setNome(rs.getString("nome"));
                pVO.setValorCusto(rs.getDouble("valorcusto"));
                pVO.setQuantidade(rs.getLong("quantidade"));

                /* Inserindo o objeto pVO no ArrayList */
                produtos.add(pVO);

            }

            //Retornando o ArrayList com todos objetos
            return produtos;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }
    }

    public void alterarProduto(ProdutoVO pVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        PreparedStatement pstmt = null;
        
        try {
            String sql;

            sql = "update produto set "
                    + "nome=?, valorcusto=?, quantidade=? "
                    + "where idproduto=?";

            pstmt = con.prepareStatement(sql);
            
            pstmt.setString(1, pVO.getNome());
            pstmt.setDouble(2, pVO.getValorCusto());
            pstmt.setLong(3, pVO.getQuantidade());
            pstmt.setLong(4, pVO.getIdProduto());

            pstmt.executeUpdate();

        } catch (SQLException se) {
            throw new SQLException("Erro ao alterar produto! " + se.getMessage());
        } finally {
            con.close();
            pstmt.close();
        }
    }
}
