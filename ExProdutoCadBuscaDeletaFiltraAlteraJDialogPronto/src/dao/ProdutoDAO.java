/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
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

    /**
     * @author Thiago Cury
     * @since 07/04/2014 - 11:46
     * @version 1.0 beta
     */
    public void cadastrarProduto(ProdutoVO pVO) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL */
            sql = "insert into produto(idproduto,nome,valorcusto,quantidade)"
                    + "values(null, '" + pVO.getNome() + "', " + pVO.getValorCusto() + ", " + pVO.getQuantidade() + ")";

            //Executando o sql
            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao inserir produto!");
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

   public void alterarProduto(ProdutoVO pVO) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            //String que receberá instrução SQL
            String sql;

            /* Montando a instrução INSERT para inserir
             um objeto pVO no Banco MySQL */
            sql = "update produto "
                 +"set nome = '" + pVO.getNome() + "', valorcusto = " + pVO.getValorCusto() + ", quantidade =" + pVO.getQuantidade() + " "
                 +"where idproduto = "+pVO.getIdProduto();

            //Executando o sql
            stat.executeUpdate(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao alterar produto!"+e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método    
    
    /**
     * @author Thiago Cury
     * @since 09/04/2014 - 09:05
     * @version 1.0 beta
     */
    public ArrayList<ProdutoVO> buscarProdutos() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            //Montando o sql            
            sql = "select * from produto";

            /* Executando o SQL  e armazenando
             o ResultSet em um objeto do tipo
             ResultSet chamado rs */
            ResultSet rs = stat.executeQuery(sql);

            /* Criando ArrayList para armazenar 
             objetos do tipo produto */
            ArrayList<ProdutoVO> prod = new ArrayList<>();

            /* Enquanto houver uma próxima linha no 
             banco de dados o while roda */
            while (rs.next()) {
                //Criando um novo obj. ProdutoVO
                ProdutoVO p = new ProdutoVO();

                /* Mapeando a tabela do banco para objeto
                 chamado pVO */
                p.setIdProduto(rs.getLong("idproduto"));
                p.setNome(rs.getString("nome"));
                p.setValorCusto(rs.getDouble("valorcusto"));
                p.setQuantidade(rs.getInt("quantidade"));

                /* Inserindo o objeto pVO no ArrayList */
                prod.add(p);
            }//fecha while

            //Retornando o ArrayList com todos objetos
            return prod;

        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produtos! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método buscarProduto

    //Método deletarProduto
    /**
     * @author Thiago Cury
     * @since 17/04/2014
     * @version 1.0beta
     * @param idProduto
     * @throws SQLException
     */
    public void deletarProduto(long idProduto) throws SQLException {

        //Buscando uma conexão com o Banco de Dados
        Connection con = ConexaoBanco.getConexao();
        /*Criando obj. capaz de executar instruções
         SQL no banco de dados*/
        Statement stat = con.createStatement();

        try {
            String sql;
            /* Montando uma String que delete um registro através de um
             código(idProduto) enviado pelo usuário. */
            sql = "delete from produto where idproduto=" + idProduto;

            stat.execute(sql);
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletar produto! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método deletarProduto    

    /**
     * @author Thiago Cury
     * @since 17/04/2014
     * @version 1.0beta
     * @param query
     * @return um ArrayList com os produtos filtrados no banco
     * @throws SQLException
     */
    public ArrayList<ProdutoVO> filtrar(String query) throws SQLException {
        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from produto " + query;

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<ProdutoVO> prod = new ArrayList<>();

            while (rs.next()) {
                ProdutoVO pVO = new ProdutoVO();
                pVO.setIdProduto(rs.getInt("idproduto"));
                pVO.setNome(rs.getString("nome"));
                pVO.setValorCusto(rs.getDouble("valorcusto"));
                pVO.setQuantidade(rs.getInt("quantidade"));
                prod.add(pVO);
            }//Fecha while
            return prod;
        } catch (SQLException se) {
            throw new SQLException("Erro ao buscar dados do Banco! " + se.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método filtrar    

}//fecha classe
