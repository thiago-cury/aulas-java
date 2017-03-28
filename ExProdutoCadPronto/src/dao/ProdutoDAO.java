/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Produto;
import persistencia.ConexaoBanco;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ProdutoDAO {
   
   public void cadastrarProduto(Produto p) throws SQLException{
       Connection con = ConexaoBanco.getConexao();
       Statement stat = con.createStatement();
       try {
           String sql = "";
           
           sql = "insert into produto(idProduto,nome,valorCusto,quantidade)"
                +"values(null,'"+p.getNome()+"',"+p.getValorCusto()+","+p.getQuantidade()+")";
           
           stat.execute(sql);
           
       } catch (SQLException e) {
           throw new SQLException(
           "Erro ao cadastrar produto!"+e.getMessage());
       } finally {
           stat.close();
           con.close();
       }//fecha finally
   }//fecha cadastrarProduto
}//fecha classe
