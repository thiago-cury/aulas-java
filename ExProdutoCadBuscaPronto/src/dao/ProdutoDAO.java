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
import modelo.Produto;
import persistencia.ConexaoBanco;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ProdutoDAO {

    public void cadastrarProduto(Produto pVO) throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql;

            sql = "insert into produto(idproduto,nome,valorcusto,quantidade)"
                    + "values(null, '" + pVO.getNome() + "', " + pVO.getValorCusto() + ", " + pVO.getQuantidade() + ")";

            stat.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar produto! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método

    public ArrayList<Produto> buscarProdutos() throws SQLException {

        Connection con = ConexaoBanco.getConexao();
        Statement stat = con.createStatement();

        try {
            String sql = "";
            sql = "select * from produto";
            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Produto> prods = new ArrayList<>();

            while (rs.next()) {
                
                Produto p = new Produto();
                p.setIdProduto(rs.getLong("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setValorCusto(rs.getDouble("valorCusto"));
                p.setQuantidade(rs.getInt("quantidade"));
                
                prods.add(p);
            }//fecha while

            return prods;

        } catch (SQLException e) {
            throw new SQLException(
                    "Erro ao buscar produtos!" + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha buscarProdutos
}//fecha classe
